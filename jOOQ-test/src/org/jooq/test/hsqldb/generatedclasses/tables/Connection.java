/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.6"},
                            comments = "This class is generated by jOOQ")
public class Connection extends org.jooq.impl.TableImpl<org.jooq.test.hsqldb.generatedclasses.tables.records.ConnectionRecord> {

	private static final long serialVersionUID = -379198363;

	/**
	 * The singleton instance of PUBLIC.CONNECTION
	 */
	public static final org.jooq.test.hsqldb.generatedclasses.tables.Connection CONNECTION = new org.jooq.test.hsqldb.generatedclasses.tables.Connection();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.test.hsqldb.generatedclasses.tables.records.ConnectionRecord> __RECORD_TYPE = org.jooq.test.hsqldb.generatedclasses.tables.records.ConnectionRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.hsqldb.generatedclasses.tables.records.ConnectionRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.test.hsqldb.generatedclasses.tables.records.ConnectionRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * No further instances allowed
	 */
	private Connection() {
		super("CONNECTION", org.jooq.test.hsqldb.generatedclasses.Public.PUBLIC);
	}

	/**
	 * No further instances allowed
	 */
	private Connection(java.lang.String alias) {
		super(alias, org.jooq.test.hsqldb.generatedclasses.Public.PUBLIC, org.jooq.test.hsqldb.generatedclasses.tables.Connection.CONNECTION);
	}

	@Override
	public org.jooq.test.hsqldb.generatedclasses.tables.Connection as(java.lang.String alias) {
		return new org.jooq.test.hsqldb.generatedclasses.tables.Connection(alias);
	}
}
