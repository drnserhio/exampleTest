//package com.example.refactoring_3_example;
//
//public class CommandFacadeImpl {
//
//    private final ContextUtil contextUtil;
//    private final ControllerUtil controllerUtil;
//
//    public void validationCommand(CommandType commandType, Command command) {
//
//        switch (commandType) {
//            case REBOOT_CHANNEL -> {
//                if (isAttemptsNumberExhausted(command.isAttemptsNumberExhausted())) {
//                    contextUtil.deleteCommand(command.getCommandType());
//                    return;
//                }
//                if (isTimeToSend(command)) {
//                    contextUtil.sendCommandToContext(ctx, lineAddress, currentCommand.getCommandText());
//                    controllerUtil.sendMsg(lineAddress.getHostName(), lineAddress.getPort(), 0, EnumGoip.getByModel(getGoipModel()), currentCommand.getCommandText()), false)
//                }
//            }
//            default -> {
//                if (isAttemptsNumberExhausted(command.isAttemptsNumberExhausted())) {
//                    deleteCommand(command.getCommandType());
//                    return;
//                }
//                contextUtil.sendCommandToContext(ctx, lineAddress, command.getCommandText());
//                controllerUtil.sendMsg(lineAddress.getHostName(), lineAddress.getPort(), 0, EnumGoip.getByModel(getGoipModel()), currentCommand.getCommandText()), false)
//                command.setSendDate(new Date());
//                command.incSendCounter();
//            }
//        }
//    }
//}
//}
