//-----------------------------------------------------------------------------
// PACKAGE DEFINITION
//-----------------------------------------------------------------------------
package uicc.system;

import uicc.toolkit.*;

//-----------------------------------------------------------------------------
// IMPORTS
//-----------------------------------------------------------------------------

/**
 * The <code>TerminalCapabilityHandler</code> class provide the means to  
 * to retreive the <code>Terminal capability TLV</code> being provided by 
 * the Terminal Capability APDU command defined in TS 102 221[6].
 * A <b>Temporary JCRE Entry Point Object</b> implementing 
 * the <code>BERTLVViewHandler</code> interface which encapsulates the 
 * <code>Terminal capability TLV</code> can be retreived by invoking 
 * the <code>getTheHandler()</code> method.
 *
 * @see uicc.toolkit.BERTLVViewHandler
 */
public final class TerminalCapabilityHandler {

	// --------------------------- Constants TAGs --------------------------
	/**
	 * Terminal power supply tag = 0x80
	 */
	public final static byte TAG_TERMINAL_POWER_SUPPLY = (byte)0x80;
	/**
	 * Extended logical channels terminal support tag = 0x81
	 */
	public final static byte TAG_EXTENDED_LOGICAL_CHANNELS_TERMINAL_SUPPORT = (byte)0x81;
	/**
	 * Additional interface support tag = 0x82
	 */
	public final static byte TAG_ADDITIONAL_INTERFACE_SUPPORT = (byte)0x82;
	/**
	 * eUICC related capabilities tag = 0x83
	 */
	public final static byte TAG_EUICC_RELATED_CAPABILITIES = (byte)0x83;

	// ------------------------------- Public methods -------------------------
	/**
	 * Constructor for the TerminalCapabilityHandler object
	 */
	private TerminalCapabilityHandler() {
	}

	/**
	 * Returns the single system instance of an object that implements the 
	 *  <code>BERTLVViewHandler</code> interface encapsulating the <code>Terminal 
	 *  capability TLV</code> provided by the <code>Terminal Capability 
	 *  APDU</code> command defined in TS 102 221[6].
	 *
	 * @return reference of the temporary JCRE entry point object 
	 * 			implementing the <code>BERTLVViewHandler</code> interface that exposes 
	 *			Terminal Capability TLV informations
	 * @exception UICCSystemException with the following reason codes:
	 *	<ul>
	 *    <li>{@link uicc.system.UICCSystemException#TERMINAL_CAPABILITY_NOT_AVAILABLE TERMINAL_CAPABILITY_NOT_AVAILABLE}
	 *			if the Terminal Capability command as not been issued.
	 *	</ul>
	 */
	public static BERTLVViewHandler getTheHandler() throws UICCSystemException {
		return null;
	}
}
