# Building A simple PONG game in python


# Getting Started
import turtle
import winsound
wn = turtle.Screen()
wn.title("Pong Game By Rushabh")
wn.bgcolor("salmon")
wn.setup(width=800, height=600)
wn.tracer(0)


#Keeping Track of Scores
score_a = 0
score_b = 0

#Paddle A
paddle_a = turtle.Turtle()
paddle_a.speed(0)
paddle_a.shape("square")
paddle_a.shapesize(stretch_wid=5, stretch_len=1)
paddle_a.color("white")
paddle_a.penup()
paddle_a.goto(-350, 0)

#Paddle B
paddle_b = turtle.Turtle()
paddle_b.speed(0)
paddle_b.shape("square")
paddle_b.shapesize(stretch_wid=5, stretch_len=1)
paddle_b.color("white")
paddle_b.penup()
paddle_b.goto(350, 0)

#Ball
Ball = turtle.Turtle()
Ball.speed(0)
Ball.shape("square")
Ball.color("white")
Ball.penup()
Ball.goto(0, 0)
Ball.dx = 0.4
Ball.dy = -0.4

#Pen
pen = turtle.Turtle()
pen.speed(0)
pen.color("white")
pen.penup()
pen.hideturtle()
pen.goto(0, 260)
pen.write("Player A: 0  Player B: 0", align="center", font=("courier", 24, "normal"))



#Function Of the Game

#Function 1 to move the paddle_a up

def paddle_a_up():
    y = paddle_a.ycor()
    y += 20
    paddle_a.sety(y)

#Function 2 to move the paddle_a down
def paddle_a_down():
    y = paddle_a.ycor()
    y -= 20
    paddle_a.sety(y)

#Function 1 to move the paddle_b up

def paddle_b_up():
    y = paddle_b.ycor()
    y += 20
    paddle_b.sety(y)

#Function 2 to move the paddle_b down
def paddle_b_down():
    y = paddle_b.ycor()
    y -= 20
    paddle_b.sety(y)


#Keyboard binding
wn.listen()
wn.onkeypress(paddle_b_up, "Up")
wn.onkeypress(paddle_b_down, "Down")
wn.onkeypress(paddle_a_up, "w")
wn.onkeypress(paddle_a_down, "s")

#Main game Loop
while True:
    wn.update()
    #Moving The Ball
    Ball.setx(Ball.xcor() + Ball.dx)
    Ball.sety(Ball.ycor() + Ball.dy)
    #border checking

    #Top Border Checking
    if Ball.ycor() > 290:
        Ball.sety(290)
        Ball.dy *= -1
        winsound.PlaySound("bounce.wav", winsound.SND_ASYNC)

    #Bottom Border Checking
    if Ball.ycor() < -290:
        Ball.sety(-290)
        Ball.dy *= -1
        winsound.PlaySound("bounce.wav", winsound.SND_ASYNC)

    
    #Right Border Checking
    if Ball.xcor() > 390:
        Ball.goto(0, 0)
        Ball.dx *= -1
        score_a += 1
        pen.clear()
        pen.write("Player A: {}  Player B: {}".format(score_a, score_b), align="center", font=("courier", 24, "normal"))
        winsound.PlaySound("bounce.wav", winsound.SND_ASYNC)


     #Left Border Checking
    if Ball.xcor() < -390:
        Ball.goto(0, 0)
        Ball.dx *= -1
        score_b += 1
        pen.clear()
        pen.write("Player A: {}  Player B: {}".format(score_a, score_b), align="center", font=("courier", 24, "normal"))
        winsound.PlaySound("bounce.wav", winsound.SND_ASYNC)


    # Pladdle and ball collisions

    # For Paddle_b
    if (Ball.xcor() > 340 and Ball.xcor() > 350) and (Ball.ycor() < paddle_b.ycor() + 40 and Ball.ycor() > paddle_b.ycor() - 40):
        Ball.setx(340)
        Ball.dx *= -1
        winsound.PlaySound("Boom.wav", winsound.SND_ASYNC)

     # For Paddle_a
    if (Ball.xcor() < -340 and Ball.xcor() < -350) and (Ball.ycor() < paddle_a.ycor() + 40 and Ball.ycor() > paddle_a.ycor() - 40):
        Ball.setx(-340)
        Ball.dx *= -1
        winsound.PlaySound("Boom.wav", winsound.SND_ASYNC)




