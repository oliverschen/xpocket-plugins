package com.perfma.xlab.xpocket.plugin.jvm;

import com.perfma.xlab.xpocket.spi.command.AbstractXPocketCommand;
import com.perfma.xlab.xpocket.spi.command.CommandInfo;
import com.perfma.xlab.xpocket.spi.process.XPocketProcess;


/**
 * @author chenkui
 */
@CommandInfo(name = "jvm", usage = "Usage: objects [options] <pid> \n\t " +
        "to connect to running process and print histogram of java object heap \n" +
        "live         count only live objects\n" +
        "      all          count all objects in the heap (default if one of \"live\" or \"all\" is not specified)\n" +
        "      file=<file>  dump data to <file>")
public class JvmXPocketCommand extends AbstractXPocketCommand {

    @Override
    public void invoke(XPocketProcess process) throws Throwable {
        JvmXPocketAdapter.invoke(process);
        process.end();
    }
}
