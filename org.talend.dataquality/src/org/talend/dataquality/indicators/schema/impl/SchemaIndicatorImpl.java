/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package org.talend.dataquality.indicators.schema.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.talend.dataquality.indicators.Indicator;
import org.talend.dataquality.indicators.impl.CompositeIndicatorImpl;
import org.talend.dataquality.indicators.schema.SchemaIndicator;
import org.talend.dataquality.indicators.schema.SchemaPackage;
import org.talend.dataquality.indicators.schema.TableIndicator;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Indicator</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.dataquality.indicators.schema.impl.SchemaIndicatorImpl#getTableCount <em>Table Count</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.schema.impl.SchemaIndicatorImpl#getKeyCount <em>Key Count</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.schema.impl.SchemaIndicatorImpl#getIndexCount <em>Index Count</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.schema.impl.SchemaIndicatorImpl#getViewCount <em>View Count</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.schema.impl.SchemaIndicatorImpl#getTriggerCount <em>Trigger Count</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.schema.impl.SchemaIndicatorImpl#getTotalRowCount <em>Total Row Count</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SchemaIndicatorImpl extends CompositeIndicatorImpl implements SchemaIndicator {

    /**
     * The default value of the '{@link #getTableCount() <em>Table Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTableCount()
     * @generated
     * @ordered
     */
    protected static final int TABLE_COUNT_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getTableCount() <em>Table Count</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getTableCount()
     * @generated
     * @ordered
     */
    protected int tableCount = TABLE_COUNT_EDEFAULT;

    /**
     * The default value of the '{@link #getKeyCount() <em>Key Count</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getKeyCount()
     * @generated
     * @ordered
     */
    protected static final int KEY_COUNT_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getKeyCount() <em>Key Count</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getKeyCount()
     * @generated
     * @ordered
     */
    protected int keyCount = KEY_COUNT_EDEFAULT;

    /**
     * The default value of the '{@link #getIndexCount() <em>Index Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIndexCount()
     * @generated
     * @ordered
     */
    protected static final int INDEX_COUNT_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getIndexCount() <em>Index Count</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getIndexCount()
     * @generated
     * @ordered
     */
    protected int indexCount = INDEX_COUNT_EDEFAULT;

    /**
     * The default value of the '{@link #getViewCount() <em>View Count</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getViewCount()
     * @generated
     * @ordered
     */
    protected static final int VIEW_COUNT_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getViewCount() <em>View Count</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getViewCount()
     * @generated
     * @ordered
     */
    protected int viewCount = VIEW_COUNT_EDEFAULT;

    /**
     * The default value of the '{@link #getTriggerCount() <em>Trigger Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTriggerCount()
     * @generated
     * @ordered
     */
    protected static final int TRIGGER_COUNT_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getTriggerCount() <em>Trigger Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTriggerCount()
     * @generated
     * @ordered
     */
    protected int triggerCount = TRIGGER_COUNT_EDEFAULT;

    /**
     * The default value of the '{@link #getTotalRowCount() <em>Total Row Count</em>}' attribute.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @see #getTotalRowCount()
     * @generated
     * @ordered
     */
    protected static final long TOTAL_ROW_COUNT_EDEFAULT = 0L;

    /**
     * The cached value of the '{@link #getTotalRowCount() <em>Total Row Count</em>}' attribute.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @see #getTotalRowCount()
     * @generated
     * @ordered
     */
    protected long totalRowCount = TOTAL_ROW_COUNT_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected SchemaIndicatorImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SchemaPackage.Literals.SCHEMA_INDICATOR;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public long getTotalRowCount() {
        return totalRowCount;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setTotalRowCount(long newTotalRowCount) {
        long oldTotalRowCount = totalRowCount;
        totalRowCount = newTotalRowCount;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.SCHEMA_INDICATOR__TOTAL_ROW_COUNT, oldTotalRowCount, totalRowCount));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated NOT
     */
    public boolean addTableIndicator(TableIndicator tableIndicator) {
        return this.getIndicators().add(tableIndicator);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public int getTableCount() {
        return tableCount;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setTableCount(int newTableCount) {
        int oldTableCount = tableCount;
        tableCount = newTableCount;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.SCHEMA_INDICATOR__TABLE_COUNT, oldTableCount, tableCount));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public int getKeyCount() {
        return keyCount;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setKeyCount(int newKeyCount) {
        int oldKeyCount = keyCount;
        keyCount = newKeyCount;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.SCHEMA_INDICATOR__KEY_COUNT, oldKeyCount, keyCount));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public int getIndexCount() {
        return indexCount;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setIndexCount(int newIndexCount) {
        int oldIndexCount = indexCount;
        indexCount = newIndexCount;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.SCHEMA_INDICATOR__INDEX_COUNT, oldIndexCount, indexCount));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public int getViewCount() {
        return viewCount;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setViewCount(int newViewCount) {
        int oldViewCount = viewCount;
        viewCount = newViewCount;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.SCHEMA_INDICATOR__VIEW_COUNT, oldViewCount, viewCount));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public int getTriggerCount() {
        return triggerCount;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setTriggerCount(int newTriggerCount) {
        int oldTriggerCount = triggerCount;
        triggerCount = newTriggerCount;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.SCHEMA_INDICATOR__TRIGGER_COUNT, oldTriggerCount, triggerCount));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case SchemaPackage.SCHEMA_INDICATOR__TABLE_COUNT:
                return new Integer(getTableCount());
            case SchemaPackage.SCHEMA_INDICATOR__KEY_COUNT:
                return new Integer(getKeyCount());
            case SchemaPackage.SCHEMA_INDICATOR__INDEX_COUNT:
                return new Integer(getIndexCount());
            case SchemaPackage.SCHEMA_INDICATOR__VIEW_COUNT:
                return new Integer(getViewCount());
            case SchemaPackage.SCHEMA_INDICATOR__TRIGGER_COUNT:
                return new Integer(getTriggerCount());
            case SchemaPackage.SCHEMA_INDICATOR__TOTAL_ROW_COUNT:
                return new Long(getTotalRowCount());
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case SchemaPackage.SCHEMA_INDICATOR__TABLE_COUNT:
                setTableCount(((Integer)newValue).intValue());
                return;
            case SchemaPackage.SCHEMA_INDICATOR__KEY_COUNT:
                setKeyCount(((Integer)newValue).intValue());
                return;
            case SchemaPackage.SCHEMA_INDICATOR__INDEX_COUNT:
                setIndexCount(((Integer)newValue).intValue());
                return;
            case SchemaPackage.SCHEMA_INDICATOR__VIEW_COUNT:
                setViewCount(((Integer)newValue).intValue());
                return;
            case SchemaPackage.SCHEMA_INDICATOR__TRIGGER_COUNT:
                setTriggerCount(((Integer)newValue).intValue());
                return;
            case SchemaPackage.SCHEMA_INDICATOR__TOTAL_ROW_COUNT:
                setTotalRowCount(((Long)newValue).longValue());
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case SchemaPackage.SCHEMA_INDICATOR__TABLE_COUNT:
                setTableCount(TABLE_COUNT_EDEFAULT);
                return;
            case SchemaPackage.SCHEMA_INDICATOR__KEY_COUNT:
                setKeyCount(KEY_COUNT_EDEFAULT);
                return;
            case SchemaPackage.SCHEMA_INDICATOR__INDEX_COUNT:
                setIndexCount(INDEX_COUNT_EDEFAULT);
                return;
            case SchemaPackage.SCHEMA_INDICATOR__VIEW_COUNT:
                setViewCount(VIEW_COUNT_EDEFAULT);
                return;
            case SchemaPackage.SCHEMA_INDICATOR__TRIGGER_COUNT:
                setTriggerCount(TRIGGER_COUNT_EDEFAULT);
                return;
            case SchemaPackage.SCHEMA_INDICATOR__TOTAL_ROW_COUNT:
                setTotalRowCount(TOTAL_ROW_COUNT_EDEFAULT);
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case SchemaPackage.SCHEMA_INDICATOR__TABLE_COUNT:
                return tableCount != TABLE_COUNT_EDEFAULT;
            case SchemaPackage.SCHEMA_INDICATOR__KEY_COUNT:
                return keyCount != KEY_COUNT_EDEFAULT;
            case SchemaPackage.SCHEMA_INDICATOR__INDEX_COUNT:
                return indexCount != INDEX_COUNT_EDEFAULT;
            case SchemaPackage.SCHEMA_INDICATOR__VIEW_COUNT:
                return viewCount != VIEW_COUNT_EDEFAULT;
            case SchemaPackage.SCHEMA_INDICATOR__TRIGGER_COUNT:
                return triggerCount != TRIGGER_COUNT_EDEFAULT;
            case SchemaPackage.SCHEMA_INDICATOR__TOTAL_ROW_COUNT:
                return totalRowCount != TOTAL_ROW_COUNT_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (tableCount: ");
        result.append(tableCount);
        result.append(", keyCount: ");
        result.append(keyCount);
        result.append(", indexCount: ");
        result.append(indexCount);
        result.append(", viewCount: ");
        result.append(viewCount);
        result.append(", triggerCount: ");
        result.append(triggerCount);
        result.append(", totalRowCount: ");
        result.append(totalRowCount);
        result.append(')');
        return result.toString();
    }

    /*
     * (non-Javadoc) ADDED scorreia 2008-03-25 reset implemented.
     * 
     * @see org.talend.dataquality.indicators.impl.IndicatorImpl#reset()
     */
    @Override
    public boolean reset() {
        boolean ok = super.reset();
        this.tableCount = TABLE_COUNT_EDEFAULT;
        this.viewCount = VIEW_COUNT_EDEFAULT;
        this.keyCount = KEY_COUNT_EDEFAULT;
        this.indexCount = INDEX_COUNT_EDEFAULT;
        this.totalRowCount = TOTAL_ROW_COUNT_EDEFAULT;
        this.triggerCount = TRIGGER_COUNT_EDEFAULT;
        for (Indicator ind : this.getIndicators()) {
            if (ind != null) {
                ind.reset();
            }
        }
        return ok;
    }

} // SchemaIndicatorImpl
