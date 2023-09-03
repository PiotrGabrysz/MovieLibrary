package org.models;

public enum MenuOptions {

    DISPLAYINFORMATIONABOUTRANDOMMOVIE(1),
    DISPLAYACTORMOVIES(2),
    QUIT(3);

    int action;
    MenuOptions(int action) {
        this.action = action;
    }
}
