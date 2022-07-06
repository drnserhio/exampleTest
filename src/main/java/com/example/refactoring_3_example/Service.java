//package com.example.refactoring_3_example;
//
//public class Service {
// TODO: Its new style refactor

//    private final CommandFacadeImpl commandFacadeImpl;
//
//    void processTask(ChannelHandlerContext ctx)
//            throws InetSocketCustomException {
//
//        InetSocketAddress lineAddress = getConnection(getIpAddress(), getUdpPort());
//
//        for (Command currentCommand : getAllCommands()) {
//            commandFacadeImpl.validationCommand(currentCommand.getCommandType(), currentCommand);
//        }
//    }
//
//
//
//}
