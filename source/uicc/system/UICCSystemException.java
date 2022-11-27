//-----------------------------------------------------------------------------
// PACKAGE DEFINITION
//-----------------------------------------------------------------------------
package uicc.system;

//-----------------------------------------------------------------------------
// IMPORTS
//-----------------------------------------------------------------------------
import javacard.framework.CardRuntimeException;

/**
 * This class extends the <code>Throwable</code> class and allows the classes of this package
 * to throw specific exceptions in case of problems. 
 */
public class UICCSystemException extends CardRuntimeException {

	// ------------------------------- Constants ------------------------------
	/**
	 * This reason code (= 1) is used to indicate that the Terminal Capability command as not been issued.
	 */
	public final static short TERMINAL_CAPABILITY_NOT_AVAILABLE = (short) 1;


	// ------------------------------- Constructors ---------------------------
	/**
	 * Construct a <code>UICCSystemException</code> instance with the specified 
	 * reason. To conserve on resources use <code>throwIt()</code> method to
	 * re-use the JCRE instance of this class.
	 *
	 * @param  reason  the reason for the exception
	 */
	public UICCSystemException(short reason) {
		super(reason);
	}


	// ------------------------------- Public methods -------------------------
	/**
	 * Throws the JCRE instance of the <code>UICCSystemException</code> class with
	 * the specified reason.
	 *
	 * @param  reason                the reason for the exception.
	 * @exception  UICCSystemException  always
	 */
	public static void throwIt(short reason) throws UICCSystemException {
	}
}
