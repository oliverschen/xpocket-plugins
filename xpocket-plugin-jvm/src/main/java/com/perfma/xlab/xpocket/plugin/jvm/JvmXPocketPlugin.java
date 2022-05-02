package com.perfma.xlab.xpocket.plugin.jvm;

import com.perfma.xlab.xpocket.spi.AbstractXPocketPlugin;
import com.perfma.xlab.xpocket.spi.process.XPocketProcess;

/**
 * @author chenkui
 */
public class JvmXPocketPlugin extends AbstractXPocketPlugin {
    private static final String LOG = "________                   \n" +
            "______(_)__   ________ ___ \n" +
            "_____  /__ | / /_  __ `__ \\\n" +
            "____  / __ |/ /_  / / / / /\n" +
            "___  /  _____/ /_/ /_/ /_/ \n" +
            "/___/                      ";

    @Override
    public void printLogo(XPocketProcess process) {
        process.output(LOG);
    }
}
