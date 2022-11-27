//-----------------------------------------------------------------------------
// PACKAGE DEFINITION
//-----------------------------------------------------------------------------
package uicc.suspendresume;

/**
 *  The <code>SuspendUtil</code> class contains utility methods to compare 
 *  and manipulate time formated as in the SUSPEND UICC command defined 
 *  in TS 102 221. The <code>TimeUnit</code> needed for the UICC SUSPEND command,
 *  is encoded in seconds, minutes, hours, days and ten days indicating the 
 *  duration of suspension.<br>

 */
public class SuspendUtil
{
    /**
     * No need to construct this class, since it is all statics.
     */
    SuspendUtil() {
    }
	
	// ------------------------------- Public methods -------------------------
	/**
	 * This method compares two provided times <code>Time1</code> 
	 * (composed of <code>TimeUnit1</code> and <code>TimeValue1</code>) and
	 * <code>Time2</code> (composed of <code>TimeUnit2</code> and 
	 * <code>TimeValue2</code>) according to the comparison method 
	 * requested encoded in <code>CompareOperation</code>.<br>
	 *
	 * @param  TimeUnit1		time unit of Time1 defined in 
	 * {@link uicc.suspendresume.SuspendConstants#TIME_UNIT_SECONDS
	 *	TIME_UNIT_XXX}.
	 * @param  TimeValue1		time value of Time1.
	 * @param  CompareOperation	comparison method defined in 
	 * {@link uicc.suspendresume.SuspendConstants#COMPARE_IS_EQUAL
	 *		COMPARE_IS_XXX}.
	 * @param  TimeUnit2		time unit of Time2 defined in 
	 * {@link uicc.suspendresume.SuspendConstants#TIME_UNIT_SECONDS
	 *	TIME_UNIT_XXX}.
	 * @param  TimeValue2		time value of Time2.
	 * @return 
	 * <ul>
     * <li><code>true</code> for comparison method 
	 *		{@link uicc.suspendresume.SuspendConstants#COMPARE_IS_EQUAL
	 *		COMPARE_IS_EQUAL}
	 *		if Time1 and Time2 are equal.
 	 * <li><code>true</code> for  comparison method
	 *  	{@link uicc.suspendresume.SuspendConstants#COMPARE_IS_LOWER
	 *		COMPARE_IS_LOWER} 
	 *  	if Time1 is strictly lower than Time2.
 	 * <li><code>true</code> for  comparison method 
	 *  	{@link uicc.suspendresume.SuspendConstants#COMPARE_IS_HIGHER
	 *		COMPARE_IS_HIGHER}
	 *  	if Time1 is strictly higher than Time2.
     * <li><code>true</code> for  comparison method 
	 *  	{@link uicc.suspendresume.SuspendConstants#COMPARE_IS_NOT_EQUAL
	 *		COMPARE_IS_NOT_EQUAL}
	 *  	if the values are not equal.
	 * </ul>
     * @exception uicc.suspendresume.SuspendException with the following
     *		reason codes:
     * <ul>
	 * <li>{@link uicc.suspendresume.SuspendException#UNEXPECTED_TIME_UNIT
	 *		UNEXPECTED_TIME_UNIT} if either <code>TimeUnit1</code> or 
	 *		<code>TimeUnit2</code> or both are not defined in 
	 *		{@link uicc.suspendresume.SuspendConstants SuspendConstants}</li>
	 * <li>{@link uicc.suspendresume.SuspendException#UNEXPECTED_COMPARE
	 *		UNEXPECTED_COMPARE} if <code>CompareOperation</code> is not 
	 *		defined in {@link uicc.suspendresume.SuspendConstants
	 *		SuspendConstants}</li>
	 * </ul>
	 */
	public static final boolean timeCompare(byte TimeUnit1, short TimeValue1,
					short CompareOperation, byte TimeUnit2, short TimeValue2)
			throws uicc.suspendresume.SuspendException {
				return false;
			}
	
	/**
	 * This method converts the provided time <code>Time</code> 
	 * (composed of <code>TimeUnit</code> and <code>TimeValue</code>) to a 
	 * value in seconds in the destination array <code>bArray</code>.<br>
	 * The value in the array is an unsigned integer which is big endian encoded 
	 * i.e. with the MSB byte in <code>bOff</code> and the LSB byte in 
	 * <code>bOff+bLen-1</code>, <code>bLen</code> is the number
	 * of bytes needed to represent <code>Time</code> in an unsigned integer.
	 * The value of <code>bLen</code> is between 1 to 4.<br>
	 *
	 * @param  TimeUnit			time unit of Time defined in 
	 * {@link uicc.suspendresume.SuspendConstants#TIME_UNIT_SECONDS
	 *	TIME_UNIT_XXX}.
	 * @param  TimeValue		time value of Time.
	 * @param  bArray			destination byte array.
	 * @param  bOff				offset within destination byte array.
     * @return <code>bOff+bLen</code> where <code>bLen</code> is the 
	 * the number of bytes set in the array.
     * @exception uicc.suspendresume.SuspendException with the reason codes:
	 *		<ul>
	 *		<li>{@link uicc.suspendresume.SuspendException#UNEXPECTED_TIME_UNIT 
	 *		UNEXPECTED_TIME_UNIT} if <code>TimeUnit</code> is not 
	 *		defined in {@link uicc.suspendresume.SuspendConstants 
	 *		SuspendConstants}
	 *		</ul>
     * @exception java.lang.ArrayIndexOutOfBoundsException
     *		if the <CODE>bOff</CODE> parameter is negative or if
     *      <CODE>bOff+bLen</CODE> is greater than the length of
     *      <CODE>bArray</CODE>
     * @exception java.lang.NullPointerException
     *      if the <CODE>bArray</CODE> parameter is <CODE>null</CODE>
	 */
	public static final short timeToSeconds(byte TimeUnit, short TimeValue,
					byte[] bArray, short bOff)
			throws ArrayIndexOutOfBoundsException, NullPointerException,
				uicc.suspendresume.SuspendException {
				return (short)0;
			}

	/**
	 * This method converts the time encoded in the byte array <code>bArray</code>
	 * in seconds provided as an unsigned integer to the <code>short</code> 
	 * value which is composed of the concatenation of 
	 * <code>TimeUnit</code> and <code>TimeValue</code>.<br>
	 * The <code>TimeUnit</code> needed for the UICC SUSPEND command, is encoded in 
	 * seconds, minutes, hours, days and ten days indicating the duration of 
	 * suspension.<br>
	 * The value in the array shall be big endian encoded, i.e. with 
	 * the MSB byte in <code>bOff</code> and the LSB byte in 
	 * <code>bOff+bLen-1</code> where the value of <code>bLen</code> is between 
	 * 1 to 4.<br>
	 * The method <code>secondsToTime</code> converts the suspension time 
	 * given in seconds to the most appropriate value and unit.<br><br>
	 * The strategy for the conversion work as follows:
	 * <ul>
	 * <li>Use the smallest possible <code>TimeUnit</code> in order to achieve
	 * the best possible resolution,
	 * <li>The value of <code>TimeValue</code> in the resulting unit should be 
	 * chosen to minimize the inaccuracy with the value provided as input in seconds,
	 * however, the method to minimize this inaccuracy is implementation dependent.
	 * <li>Upon switching to the next higher <code>TimeUnit</code> 
	 * the <code>TimeValue</code> in seconds from which the next 
	 * <code>TimeUnit</code> is used is determined in such a way that the 
	 * resulting inaccuracy from the conversion is miminized: as a result values
	 * of 256 to 277 seconds are encoded as 255 seconds while 278 seconds 
	 * and up are encoded in 5 minutes and higher, ...
	 * </ul>
	 * <br>
	 * For details see the following table:<br>
	 * <table border="1" style="text-align: center;">
	 * <caption><code>TimeUnit</code> selection</caption>
	 * <tr style="text-align: center;">
	 * 		<th colspan="4">Input range in seconds</th>
	 * 		<th rowspan="3">Output Unit</th>
	 * 		<th colspan="4">Output range</th>
	 * </tr>
	 * <tr style="text-align: center;">
	 * 		<th colspan="2">Minimum</th>
	 * 		<th colspan="2">Maximum</th>
	 * 		<th colspan="2">Minimum</th>
	 * 		<th colspan="2">Maximum</th>
	 * </tr>
	 * <tr style="text-align: center;">
	 * 		<th>Dec</th>
	 * 		<th>Hex</th>
	 * 		<th>Dec</th>
	 * 		<th>Hex</th>
	 * 		<th>Dec</th>
	 * 		<th>Hex</th>
	 * 		<th>Dec</th>
	 * 		<th>Hex</th>
	 * </tr>
	 * <tr>
	 * 		<td><code>0</code></td>
	 * 		<td><code>0x00</code></td>
	 * 		<td><code>277</code></td>
	 * 		<td><code>0x0115</code></td>
	 * 		<td>{@link uicc.suspendresume.SuspendConstants#TIME_UNIT_SECONDS
	 * TIME_UNIT_SECONDS}</td>
	 * 		<td><code>0</code></td>
	 * 		<td><code>0x00</code></td>
	 * 		<td><code>255</code></td>
	 * 		<td><code>0xFF</code></td>
	 * </tr>
	 * <tr>
	 * 		<td><code>278</code></td>
	 * 		<td><code>0x116</code></td>
	 * 		<td><code>16650</code></td>
	 * 		<td><code>0x410A</code></td>
	 * 		<td>{@link uicc.suspendresume.SuspendConstants#TIME_UNIT_MINUTES
	 * TIME_UNIT_MINUTES}</td>
	 * 		<td><code>5</code></td>
	 * 		<td><code>0x05</code></td>
	 * 		<td><code>255</code></td>
	 * 		<td><code>0xFF</code></td>
	 * </tr>
	 * <tr>
	 * 		<td><code>16651</code></td>
	 * 		<td><code>0x410B</code></td>
	 * 		<td><code>934200</code></td>
	 * 		<td><code>0x0E4138</code></td>
	 * 		<td>{@link uicc.suspendresume.SuspendConstants#TIME_UNIT_HOURS
	 * TIME_UNIT_HOURS}</td>
	 * 		<td><code>5</code></td>
	 * 		<td><code>0x05</code></td>
	 * 		<td><code>255</code></td>
	 * 		<td><code>0xFF</code></td>
	 * </tr>
	 * <tr>
	 * 		<td><code>934201</code></td>
	 * 		<td><code>0x0E4139</code></td>
	 * 		<td><code>22248000</code></td>
	 * 		<td><code>0x01537A40</code></td>
	 * 		<td>{@link uicc.suspendresume.SuspendConstants#TIME_UNIT_DAYS
	 * TIME_UNIT_DAYS}</td>
	 * 		<td><code>11</code></td>
	 * 		<td><code>0x0B</code></td>
	 * 		<td><code>255</code></td>
	 * 		<td><code>0xFF</code></td>
	 * </tr>
	 * <tr>
	 * 		<td><code>22248001</code></td>
	 * 		<td><code>0x01537A41</code></td>
	 * 		<td><code>221183999</code></td>
	 * 		<td><code>0x0D2EFFFF</code></td>
	 * 		<td>{@link uicc.suspendresume.SuspendConstants#TIME_UNIT_TEN_DAYS
	 * TIME_UNIT_TEN_DAYS}</td>
	 * 		<td><code>26</code></td>
	 * 		<td><code>0x1A</code></td>
	 * 		<td><code>255</code></td>
	 * 		<td><code>0xFF</code></td>
	 * </tr>
	 * </table>
	 *
	 * @param  bArray			destination byte array.
	 * @param  bOff				offset within destination byte array.
	 * @param  bLen				length within destination byte array.
	 * @return Encoded Time as:
	 *	<ul>
     * 		<li>In MSB byte: the time unit selected from the predefined 
	 *		constants
	 *		{@link uicc.suspendresume.SuspendConstants#TIME_UNIT_SECONDS
	 *		TIME_UNIT_XXX} in <code>
	 *		{@link uicc.suspendresume.SuspendConstants SuspendConstants}
	 *		</code> interface
     * 		<li>In LSB byte: the maximum acceptable time value as an unsigned 
	 *		byte.
	 *	</ul>
     * @exception uicc.suspendresume.SuspendException with the reason code
	 *		{@link uicc.suspendresume.SuspendException#UNEXPECTED_OVERFLOW 
	 *		UNEXPECTED_OVERFLOW} if the provided value in seconds is above
	 *		the maximum available (221183999 or 0x0D2EFFFF seconds 
	 *		corresponding to 256 times ten days minus 1 second).
     * @exception java.lang.ArrayIndexOutOfBoundsException
     *		if the <CODE>bOff</CODE> parameter is negative or if
     *      <CODE>bOff+bLen</CODE> is greater than the length of
     *      <CODE>bArray</CODE>
     * @exception java.lang.NullPointerException
     *      if the <CODE>bArray</CODE> parameter is <CODE>null</CODE>
	 */
	public static final short secondsToTime(byte[] bArray, short bOff, 
				short bLen)
			throws ArrayIndexOutOfBoundsException, NullPointerException,
				uicc.suspendresume.SuspendException {
				return (short)0;
			}
}

