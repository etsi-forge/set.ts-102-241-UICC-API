// PACKAGE DEFINITION
package uicc.services.highupdatearray;

//IMPORTS
import javacard.framework.*;

/**
 * The <code>HighUpdateArrayBuilder</code> interface provides methods for creation of
 * arrays supporting high usage of update operations with respect to
 * Java Card conventional arrays. The minimum number of update operations
 * is specified for the UICC by the JX property.
 * These arrays are intended to contain data for which the update operations is expected to be
 * higher than required for general data.
 */



public interface HighUpdateArrayBuilder extends Shareable{

    /** JX Property value : High Update Array minimum update property, value JA corresponding to 100,000 update operations. Constant = (short)1;
     */
    public static final short HIGH_UPDATE_ARRAY_MIN_UPDATE_JA           = (short)1;

    /** JX Property value : High Update Array minimum update property, value JB corresponding to 500,000 update operations. Constant = (short)2;
     */
    public static final short HIGH_UPDATE_ARRAY_MIN_UPDATE_JB           = (short)2;

    /** JX Property value : High Update Array minimum update property, value JC corresponding to 1,000,000 update operations. Constant = (short)3;
     */
    public static final short HIGH_UPDATE_ARRAY_MIN_UPDATE_JC           = (short)3;


	/**
	 * Create a persistent <code>boolean</code> array with the specified array length and with
	 * extended endurance in terms of update operations with respect to arrays created
	 * by means of the Java <code>new</code> keyword.
	 *
	 * @param length   the length of the boolean array
	 * @exception SystemException with the following reason code: <ul>
	 *      <li><code>SystemException.NO_RESOURCE</code> if there are not enough resources in the
	 *	card to allocate the array</li>
	 *      </ul>
	 * @exception NegativeArraySizeException if the length parameter is negative
	 * @return    the new high update boolean array
	 */
	public boolean[] makeHighUpdateBooleanArray(short length);


	/**
	 * Create a persistent <code>byte</code> array with the specified array length and with
	 * extended endurance in terms of update operations with respect to arrays created
	 * by means of the Java <code>new</code> keyword
	 *
	 * @param length   the length of the byte array
	 * @exception SystemException with the following reason code: <ul>
	 *      <li><code>SystemException.NO_RESOURCE</code> if there are not enough resources in the
	 *	              card to allocate the array</li>
	 *      </ul>
	 * @exception NegativeArraySizeException if the length parameter is negative
	 * @return    the new high update byte array
	 */
	public byte[] makeHighUpdateByteArray(short length);


	/**
	 * Create a persistent <code>Object</code> array with the specified array length and with
	 * extended endurance in terms of update operations with respect to arrays created
	 * by means of the Java <code>new</code> keyword.
	 *
	 * @param length   the length of the Object array
	 * @exception SystemException with the following reason code: <ul>
	 *      <li><code>SystemException.NO_RESOURCE</code> if there are not enough resources in the
	 *	              card to allocate the array</li>
	 *      </ul>
	 * @exception NegativeArraySizeException if the length parameter is negative
	 * @return    the new high update Object array
	 */
	public Object[] makeHighUpdateObjectArray(short length);


	/**
	 * Create a persistent <code>short</code> array with the specified array length and with
	 * extended endurance in terms of update operations with respect to arrays created
	 * by means of the Java <code>new</code> keyword.
	 *
	 * @param length   the length of the short array
	 * @exception SystemException with the following reason code: <ul>
	 *      <li><code>SystemException.NO_RESOURCE</code> if there are not enough resources in the
 	 *	              card to allocate the array</li>
	 *      </ul>
	 * @exception NegativeArraySizeException if the length parameter is negative
	 * @return    the new high update short array
	 */
	public short[] makeHighUpdateShortArray(short length);

	/**
	 * Return the value of minimum number of update operations property (JX property)
	 * for the high update arrays supported by the UICC.
	 *
	 * @return    a constant HIGH_UPDATE_ARRAY_MIN_UPDATE_Jx
	 *            indicating the JX property
	 */
	public short   getHighUpdateMinimumUpdateProperty();
}

