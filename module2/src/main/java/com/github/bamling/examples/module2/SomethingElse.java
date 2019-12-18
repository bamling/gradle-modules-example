package com.github.bamling.examples.module2;

import com.github.bamling.examples.module1.Something;

public class SomethingElse {

    private final Something something;

    public SomethingElse(final Something something) {
        this.something = something;
    }

    public String getSomething() {
        return something.getSomething();
    }

}
