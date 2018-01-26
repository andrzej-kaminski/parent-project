package com.integr.start;

import com.sub.SubStarter;

public class Starter {
    public void start() {
        new SubStarter().subStart();
        new SubStarter().stop();
    }
}
