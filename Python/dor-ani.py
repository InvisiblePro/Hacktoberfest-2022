import math
import random
from math import cos, sin, sqrt
from random import randrange

import pygame

WIDTH = 800
HEIGHT = 800
CENTER = WIDTH // 2, HEIGHT // 2
centerX = WIDTH // 2
centerY = HEIGHT // 2

G = 0.2
M = 10e7

BLACK = (0, 0, 0)
WHITE = (255, 255, 255)

r0 = 10

pygame.init()


class Particle:
    def __init__(self, x, y):
        self.g = G
        self.mass = 2
        self.x = x
        self.y = y
        self.momentum_x = 500
        self.momentum_y = 500
        self.dt = 0.001

    def move(self, x_y_central_mass):
        x2 = x_y_central_mass[0]
        y2 = x_y_central_mass[1]
        hyp = (self.x - x2) ** 2 + (self.y - y2) ** 2
        theta = math.atan2(y2 - self.y, x2 - self.x)
        force = (self.g * self.mass * M) / hyp
        force_x = force * math.cos(theta)
        force_y = force * math.sin(theta)
        self.momentum_x += force_x * self.dt
        self.momentum_y += force_y * self.dt
        self.x += self.momentum_x / self.mass * self.dt
        self.y += self.momentum_y / self.mass * self.dt
        return [self.x, self.y]


screen = pygame.display.set_mode((WIDTH, HEIGHT))

particles = []

r = 200


# Line
def generator():
    for i in range(1000):
        x = randrange(-500, 1000)
        y = 100
        p = Particle(x, y)
        particles.append(p)


# Circle
# def generator():
#     for i in range(1000):
#         ang = random.uniform(0, 1) * 2 * math.pi
#         hyp = sqrt(random.uniform(0, 1)) * r
#         adj = cos(ang) * hyp
#         opp = sin(ang) * hyp
#         x = centerX + adj
#         y = centerY + opp
#         p = Particle(x, y)
#         particles.append(p)


# Square
# def generator():
#     for i in range(500):
#         x = randrange(0, 500)
#         y = randrange(0, 500)
#         p = Particle(x, y)
#         particles.append(p)


generator()


def draw():
    for i in range(len(particles)):
        pygame.draw.circle(screen, WHITE, (particles[i].move(CENTER)), 1)


running = True
while running:

    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            running = False

    screen.fill(BLACK)

    # Gravity point
    # central_mass = pygame.draw.circle(screen, WHITE, CENTER, r0)

    draw()

    pygame.display.update()
