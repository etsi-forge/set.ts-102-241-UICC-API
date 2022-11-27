//-----------------------------------------------------------------------------
// PACKAGE DEFINITION
//-----------------------------------------------------------------------------
package uicc.suspendresume;

//-----------------------------------------------------------------------------
// IMPORTS
//-----------------------------------------------------------------------------


/**
 * The interface <code>SuspendConstants</code> encapsulates constants related to 
 * suspension mechanism.
 *
 */
public interface SuspendConstants {
	// --------------------------- Time Unit Constants --------------------------
	/**
	 * Time Unit : seconds  = 0
	 */
	final static byte TIME_UNIT_SECONDS = (byte) 0;
	/**
	 * Time Unit : minutes  = 1
	 */
	final static byte TIME_UNIT_MINUTES = (byte) 1;
	/**
	 * Time Unit : hours  = 2
	 */
	final static byte TIME_UNIT_HOURS = (byte) 2;
	/**
	 * Time Unit : days  = 3
	 */
	final static byte TIME_UNIT_DAYS = (byte) 3;
	/**
	 * Time Unit : 10 days  = 4
	 */
	final static byte TIME_UNIT_TEN_DAYS = (byte) 4;
	// --------------------------- suspension Rejection --------------------------
	/**
	 * Suspension request rejection = -1
	 */
	final static short SUSPEND_REQUEST_REJECTED = (short) -1;
	// --------------------------- Compare Operations --------------------------
	/**
	 * Compare if time values are equal = 1
	 */
	final static short COMPARE_IS_EQUAL = (short) 1;
	/**
	 * Compare time is lower = 2
	 */
	final static short COMPARE_IS_LOWER = (short) 2;
	/**
	 * Compare time is higher = 3
	 */
	final static short COMPARE_IS_HIGHER = (short) 3;
	/**
	 * Compare if time values are not equal = 4
	 */
	final static short COMPARE_IS_NOT_EQUAL = (short) 4;
}

