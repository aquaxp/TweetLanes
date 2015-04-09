// Copyright 2011 Google Inc.
// All Rights Reserved.

package com.tweetlanes.android.core.view;

import android.widget.ImageView;

public interface Divot {

    // Distance, in dips, from the corner of the image to the start of the
    // divot.
    // Used for non-middle positions. For middle positions this distance is
    // basically
    // to the middle of edge.
    float CORNER_OFFSET = 12F;
    float WIDTH = 6F;
    float HEIGHT = 16F;

    // Where to draw the divot. LEFT_UPPER, for example, means the upper edge
    // but to the
    // left. TOP_RIGHT means the right edge but to the top.
    int LEFT_UPPER = 1;
    int LEFT_MIDDLE = 2;
    int LEFT_LOWER = 3;

    int RIGHT_UPPER = 4;
    int RIGHT_MIDDLE = 5;
    int RIGHT_LOWER = 6;

    int TOP_LEFT = 7;
    int TOP_MIDDLE = 8;
    int TOP_RIGHT = 9;

    int BOTTOM_LEFT = 10;
    int BOTTOM_MIDDLE = 11;
    int BOTTOM_RIGHT = 12;

    String[] sPositionChoices = new String[]{"", "left_upper",
            "left_middle", "left_lower",

            "right_upper", "right_middle", "right_lower",

            "top_left", "top_middle", "top_right",

            "bottom_left", "bottom_middle", "bottom_right",};

    void setPosition(int position);

    int getPosition();

    float getCloseOffset();

    float getFarOffset();

    ImageView asImageView();
    // public void assignContactFromEmail(String emailAddress);
}
