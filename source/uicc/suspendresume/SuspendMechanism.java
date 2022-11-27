//-----------------------------------------------------------------------------
// PACKAGE DEFINITION
//-----------------------------------------------------------------------------
package uicc.suspendresume;

/**
 *  Provides callbacks to applet to behave with suspension mechanism.
 *  The interface <code>uicc.suspendresume.SuspendMechanism</code> provides a callback
 *  interface for applets to be notified by the UICC Runtime Environment about
 *  suspension operations. An applet Class (which extends the 
 *  <code>javacard.framework.Applet</code> class) must implement this interface
 *  if their instances needs to be involved for suspension and resume 
 *  operations.
 */
public interface SuspendMechanism
{
	
	// ------------------------------- Public methods -------------------------

	/**
	 * This method is called by the UICC runtime environment to inform the 
	 * applet that a suspend operation has been requested with a proposed 
	 * suspension time interval.<P>The applet should, within this method, check 
	 * if the minimum time proposed is acceptable, meaning
	 * lower than the maximum suspension time acceptable for the applet.
	 * If the minimum time does not exceed the acceptable 
	 * suspension time for the applet, the applet should return 
	 * the maximum acceptable suspension time in the proposed range or reject
	 * the request.<br>
	 * If the applet returns a higher suspension time than proposed by the 
	 * terminal, this value will be ignored by the UICC Runtime environment.
	 * If the applet returns a value below the proposed minimal,
	 * an invalid time unit or raise an exception, the UICC Runtime 
	 * Environment shall then reject the suspension.<p>
	 *	 
	 * This method is executed in the context of the <i>active applet instance</i>
	 * as the <i>currently selected applet instance</i>.<p>
	 *	 
 	 * Note:<ul>
 	 * <li><em>As the UICC Runtime Environment may reject the suspension, 
	 * the applet should not perform any action based on the assumption 
	 * that the supension will succeed.</em>
 	 * <li><em>If the applet accepts the suspension, it is allowed to use any 
	 * time unit constant defined in {@link uicc.suspendresume.SuspendConstants
	 * SuspendConstants} interface.</em>
 	 * </ul>
	 *
	 * @param  minTimeUnit	proposed minimum time unit.
	 * @param  minTimeValue	proposed minimum time value.
	 * @param  maxTimeUnit	proposed maximum time unit.
	 * @param  maxTimeValue	proposed maximum time value.
	 * @return 
	 * <ul>
	 *  <li>{@link uicc.suspendresume.SuspendConstants#SUSPEND_REQUEST_REJECTED 
	 *  SUSPEND_REQUEST_REJECTED} to reject the request or,
     *  <li>Maximum acceptable time to accept the request encoded as:<ul>
     * 		<li>In MSB byte: the maximum acceptable time unit selected from the 
	 * 		predefined constants in <code>{@link uicc.suspendresume.SuspendConstants
	 *		SuspendConstants}</code> interface
     * 		<li>In LSB byte: the maximum acceptable time value as un unsigned byte.</ul>
	 * </ul>
	 */
	short suspendRequest(byte minTimeUnit, short minTimeValue, byte maxTimeUnit, short maxTimeValue);

	/**
	 * This method is called by the UICC runtime environment to inform the 
	 * applet that a suspend operation has been accepted with a maximum 
	 * suspension time interval. Applet should, within this method, proceed 
	 * with all their necessary operation for suspension.<p>
	 *	 
	 * This method is executed in the context of the <i>active applet instance</i>
	 * as the <i>currently selected applet instance</i>.<p>
	 *
 	 * Note:<ul>
 	 * <li><em>Exceptions thrown by this method are caught by the UICC runtime 
	 * environment and ignored.</em>
 	 * <li><em>The applet should be prepared that a subsequent resume operation
 	 * may not follow. Instead an invocation in another card session may
 	 * occur without previous resume operation.</em>
 	 * </ul>
	 *
	 * @param  newMaxTimeUnit	new maximum interval time unit.
	 * @param  newMaxTimeValue	new maximum interval time value.
	 */
	void suspendOperation(byte newMaxTimeUnit, short newMaxTimeValue);

	/**
	 * This method is called by the UICC runtime environment to inform the 
	 * applet that a resume operation will be done.
	 * The applet should proceed with all its necessary operations for a proper 
	 * resume process.<p>
	 * This method is executed in the context of the <i>active applet instance</i>
	 * as the <i>currently selected applet instance</i>.<p>
	 *
 	 * Note:<ul>
 	 * <li><em>Exceptions thrown by this method are caught by the UICC runtime 
	 * environment and ignored.</em>
 	 * </ul>
	 */
	void resumeIndication();
}

