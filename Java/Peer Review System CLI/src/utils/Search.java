package utils;

import java.util.List;

import errors.NotFoundException;
import models.Work;

public class Search {

    private Search() {
    }

    public static int searchWorkById(String id, List<Work> works) throws NotFoundException {
        for (int i = 0; i < works.size(); i++) {
            if (works.get(i).getwId().equals(id)) {
                return i;
            }
        }
        throw new NotFoundException("Can't find work by id: " + id);
    }

    public static Work getWorkById(String id, List<Work> works) throws NotFoundException {
        int index = searchWorkById(id, works);
        return works.get(index);
    }
}
