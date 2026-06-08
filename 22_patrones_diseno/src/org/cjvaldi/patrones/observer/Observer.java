package org.cjvaldi.patrones.observer;

import java.util.Objects;

public interface Observer {
    void update(Observable observable, Object obj);
}
