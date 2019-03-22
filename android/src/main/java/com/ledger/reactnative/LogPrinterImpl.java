package com.ledger.reactnative;

import com.facebook.react.bridge.ReactApplicationContext;

import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *Class representing a printer of errors, warnings, infos ... (at runtime)
 *Printed logs are stored in path set by PathResolver::resolveLogFilePath
 */
public class LogPrinterImpl extends co.ledger.core.LogPrinter {
    private Logger logger;

    private com.ledger.reactnative.ExecutionContextImpl executionContext;
    public LogPrinterImpl(ReactApplicationContext reactContext) {
        this.logger = Logger.getLogger("ledger.reactnative");
        this.executionContext = new com.ledger.reactnative.ExecutionContextImpl(reactContext,1);
    }
    /**
     *Print different encountered errors
     *@param message, string
     */
    public void printError(String message) {
        this.logger.log(Level.SEVERE, message);
    }
    //public void printError(String message) {
    //    System.err.println("Error" + message);
    //}

    /**
     *Print useful information messages
     *@param message, string
     */
    public void printInfo(String message) {
        this.logger.log(Level.INFO, message);
    }

//    public void printInfo(String message) {
//        System.out.println(" Info : " + message);
//    }

    /**
     *Print debug messages
     *@param message string
     */
    public void printDebug(String message) {
        this.logger.log(Level.FINE, message);
    }
//    public void printDebug(String message) {
//        System.out.println(" Debug : " + message);
//    }

    /**
     *Print warning messages
     *@param message, string
     */
    public void printWarning(String message) {
        this.logger.log(Level.WARNING, message);
    }
//    public void printWarning(String message) {
//        System.out.println(" Warning : " + message);
//    }

    /**
     *Print messages from APDU comand interpretation loop
     *@param message, string
     */
    public void printApdu(String message) {
        this.logger.log(Level.INFO, message);
    }
//    public void printApdu(String message) {
//        System.out.println(" Apdu : " + message);
//    }

    /**
     *Print critical errors causing a core dump or error from which recovery is impossible
     *@param message, string
     */
    public void printCriticalError(String message) {
        this.logger.log(Level.SEVERE, message);
    }
//    public void printCriticalError(String message) {
//        System.err.println(" Critical Error : " + message);
//    }

    /**
     *Get context in which printer is executed (print)
     *@return ExecutionContext object
     */
    public co.ledger.core.ExecutionContext getContext() {
    	return this.executionContext;
    }
}
