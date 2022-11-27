//-----------------------------------------------------------------------------
// PACKAGE DEFINITION
//-----------------------------------------------------------------------------
package uicc.suspendresume;

//-----------------------------------------------------------------------------
// IMPORTS
//-----------------------------------------------------------------------------
import javacard.framework.CardRuntimeException;

/**
 * This class extends the <code>Throwable</code> class and allows the classes of this package
 * to throw specific exceptions in case of problems. 
 */
public class SuspendException extends CardRuntimeException {

	// ------------------------------- Constants ------------------------------
	/**
	 * This reason code (= 1) is used to indicate that the time unit format is
	 * not recognized because the value is not defined in 
	 * {@link uicc.suspendresume.SuspendConstants SuspendConstants}.
	 */
	public final static short UNEXPECTED_TIME_UNIT = (short) 1;

	/**
	 * This reason code (= 2) is used to indicate that the compare operation is
	 * not recognized because the value is not defined in 
	 * {@link uicc.suspendresume.SuspendConstants SuspendConstants}.
	 */
	public final static short UNEXPECTED_COMPARE = (short) 2;

	/**
	 * This reason code (= 3) is used to indicate that the value in seconds
	 * is above the maximum value allowed (221183999 or 0x0D2EFFFF).
	 */
	public final static short UNEXPECTED_OVERFLOW = (short) 3;

	// ------------------------------- Constructors ---------------------------
	/**
	 * Construct a <code>SuspendException</code> instance with the specified 
	 * reason. To conserve on resources use <code>throwIt()</code> method to
	 * re-use the JCRE instance of this class.
	 *
	 * @param  reason  the reason for the exception
	 */
	public SuspendException(short reason) {
		super(reason);
	}


	// ------------------------------- Public methods -------------------------
	/**
	 * Throws the JCRE instance of the <code>SuspendException</code> class with
	 * the specified reason.
	 *
	 * @param  reason                the reason for the exception.
	 * @exception  SuspendException  always
	 */
	public static void throwIt(short reason) throws SuspendException {
	}
}

