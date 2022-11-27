//-----------------------------------------------------------------------------
// PACKAGE DEFINITION
//-----------------------------------------------------------------------------
package uicc.toolkit;

//-----------------------------------------------------------------------------
// IMPORTS
//-----------------------------------------------------------------------------

/**
 * This interface is the basic class for the definition of <b>Proactive commands
 * </b>. Low level methods, as <code>init()</code>, <code>appendTLV()</code>...
 * will be used to handle generic Proactive commands (standard or future
 * definitions...). The ProactiveHandler class is a <b>Temporary JCRE Entry Point Object</b>.
 * The Toolkit Applets, which need to send Proactive commands,
 * shall call the <code>getTheHandler()</code> static method to get the
 * reference of this system instance.
 *
 * @see        ViewHandler
 * @see        EditHandler
 * @see        ProactiveResponseHandler
 * @see        ToolkitException
 */
public interface ProactiveHandler extends EditHandler {

	// ------------------------------- Public methods -------------------------

	/**
	 * Initializes the next Proactive command with Command Details and Device
	 * Identities TLV.
	 * The source device is always the UICC card. The command number is
	 * generated by the method. The Comprehension Required flags are set.
	 * After the method invocation no TLV is selected.
	 *
	 * @param  type       the command type
	 * @param  qualifier  the command qualifier
	 * @param  dstDevice  the destination device
	 */
	void init(byte type, byte qualifier, byte dstDevice);


	/**
	 * Sends the current Proactive command.
	 *
	 * @return                       general result of the command (first byte of Result TLV in Terminal Response)
	 * @exception  ToolkitException  with the following reason codes: <ul>
	 *      <li><code>UNAVAILABLE_ELEMENT</code> if the Result Comprehension TLV is missing.
	 *      <li><code>OUT_OF_TLV_BOUNDARIES</code> if the general result byte is missing in the Result Comprehension TLV.
	 *      <li><code>COMMAND_NOT_ALLOWED</code> if the Proactive command to be sent or one of its parameter is
	 *                                           not allowed by the CAT Runtime Environment.</ul>
	 */
	byte send() throws ToolkitException;


	/**
	 * Builds a Display Text Proactive command without sending the command. The Comprehension
	 * Required flags are all set to 1.
	 * After the method invocation no TLV is selected.
	 *
	 * @param  qualifier                           Display Text command qualifier
	 * @param  dcs                                 data coding scheme
	 * @param  buffer                              reference to the text string source buffer
	 * @param  offset                              offset of the text string in the source buffer
	 * @param  length                              length of the text string in the source buffer
	 * @exception  NullPointerException            if <code>buffer</code> is <code>null</code>
	 * @exception  ArrayIndexOutOfBoundsException  if <code>offset</code> or <code>length</code> or both would cause access outside array bounds
	 * @exception  ToolkitException                with the following reason codes: <ul>
	 *      <li><code>HANDLER_OVERFLOW</code> if the ProactiveHandler buffer is to small to put the requested data </ul>
	 */
	void initDisplayText(byte qualifier,
			byte dcs,
			byte[] buffer,
			short offset,
			short length) throws NullPointerException,
			ArrayIndexOutOfBoundsException,
			ToolkitException;


	/**
	 * Builds a Get Inkey Proactive command without sending the command. The Comprehension
	 * Required flags are all set to 1.
	 * After the method invocation no TLV is selected.
	 *
	 * @param  qualifier                           Get Inkey command qualifier
	 * @param  dcs                                 data coding scheme
	 * @param  buffer                              reference to the displayed text string source buffer
	 * @param  offset                              offset of the displayed text string in the source buffer
	 * @param  length                              length of the displayed text string in the source buffer
	 * @exception  NullPointerException            if <code>buffer</code> is <code>null</code>
	 * @exception  ArrayIndexOutOfBoundsException  if <code>offset</code> or <code>length</code> or both would cause access outside array bounds
	 * @exception  ToolkitException                with the following reason codes: <ul>
	 *      <li><code>HANDLER_OVERFLOW</code> if the ProactiveHandler buffer is to small to put the requested data</ul>
	 */
	void initGetInkey(byte qualifier,
			byte dcs,
			byte[] buffer,
			short offset,
			short length) throws NullPointerException,
			ArrayIndexOutOfBoundsException,
			ToolkitException;


	/**
	 * Initialize the building of a Get Input Proactive command. The Comprehension
	 * Required flags are all set to 1.
	 * The following command parameters (i.e. TLVs) may be appended to the
	 * command before sending it: Default Text.
	 * After the method invocation no TLV is selected.
	 *
	 * @param  qualifier                           Get Input command qualifier
	 * @param  dcs                                 data coding scheme
	 * @param  buffer                              reference to the displayed text string source buffer
	 * @param  offset                              offset of the displayed text string in the source buffer
	 * @param  length                              length of the displayed text string in the source buffer
	 * @param  minRespLength                       minimal length of the response text string
	 * @param  maxRespLength                       maximal length of the response text string
	 * @exception  NullPointerException            if <code>buffer</code> is <code>null</code>
	 * @exception  ArrayIndexOutOfBoundsException  if <code>offset</code> or <code>length</code> or both would cause access outside array bounds
	 * @exception  ToolkitException                with the following reason codes: <ul>
	 *      <li><code>HANDLER_OVERFLOW</code> if the ProactiveHandler buffer is to small to put the requested data</ul>
	 */
	void initGetInput(byte qualifier,
			byte dcs,
			byte[] buffer,
			short offset,
			short length,
			short minRespLength,
			short maxRespLength) throws NullPointerException,
			ArrayIndexOutOfBoundsException,
			ToolkitException;


	/**
	 * Builds a Close Channel Proactive command without sending the command.
	 * The Comprehension Required flags are all set to 1.
	 * After the method invocation no TLV is selected.
	 *
	 * @param  bChannelId  the channel identifier to be closed.
	 */
	void initCloseChannel(byte bChannelId);
	
	/**
        * Builds a More Time Proactive command without sending the command.
	* The Comprehension Required flags are all set to 1.
	* After the method invocation no TLV is selected.
	*/
	void initMoreTime();
}

