package org.idipaolo.cgraph.model;

import com.vividsolutions.jts.geom.Point;

/**
 * Created by Igor on 17/04/2015.
 */
public class Node {

    private Point position;
    private double orientation;
    private int uid;

    public boolean isReceiver() {
        return receiver;
    }

    public void setReceiver(boolean receiver) {
        this.receiver = receiver;
    }

    private boolean receiver;

    public Point getPosition() {
        return position;
    }

    public void setPosition(Point position) {
        this.position = position;
    }

    public double getOrientation() {

        return orientation;
    }

    public void setOrientation(double orientation) {
        this.orientation = orientation;
    }

    public Node(int uid)
    {
        this.uid = uid;
    }

    public int getUid()
    {
        return this.uid;
    }

    @Override
    public String toString() {
        return "Node " + String.valueOf(getUid());
    }
}
