/**
 * This class is generated by jOOQ
 */
package org.jooq.test.jdbcoracle.generatedclasses.multi_schema.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TBookRecord extends org.jooq.impl.TableRecordImpl<org.jooq.test.jdbcoracle.generatedclasses.multi_schema.tables.records.TBookRecord> implements org.jooq.Record9<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, byte[]>, org.jooq.test.jdbcoracle.generatedclasses.multi_schema.tables.interfaces.ITBook {

	private static final long serialVersionUID = -130332696;

	/**
	 * Setter for <code>MULTI_SCHEMA.T_BOOK.ID</code>. 
	 */
	@Override
	public void setId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>MULTI_SCHEMA.T_BOOK.ID</code>. 
	 */
	@Override
	public java.lang.Integer getId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>MULTI_SCHEMA.T_BOOK.AUTHOR_ID</code>. 
	 */
	@Override
	public void setAuthorId(java.lang.Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>MULTI_SCHEMA.T_BOOK.AUTHOR_ID</code>. 
	 */
	@Override
	public java.lang.Integer getAuthorId() {
		return (java.lang.Integer) getValue(1);
	}

	/**
	 * Setter for <code>MULTI_SCHEMA.T_BOOK.CO_AUTHOR_ID</code>. 
	 */
	@Override
	public void setCoAuthorId(java.lang.Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>MULTI_SCHEMA.T_BOOK.CO_AUTHOR_ID</code>. 
	 */
	@Override
	public java.lang.Integer getCoAuthorId() {
		return (java.lang.Integer) getValue(2);
	}

	/**
	 * Setter for <code>MULTI_SCHEMA.T_BOOK.DETAILS_ID</code>. 
	 */
	@Override
	public void setDetailsId(java.lang.Integer value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>MULTI_SCHEMA.T_BOOK.DETAILS_ID</code>. 
	 */
	@Override
	public java.lang.Integer getDetailsId() {
		return (java.lang.Integer) getValue(3);
	}

	/**
	 * Setter for <code>MULTI_SCHEMA.T_BOOK.TITLE</code>. 
	 */
	@Override
	public void setTitle(java.lang.String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>MULTI_SCHEMA.T_BOOK.TITLE</code>. 
	 */
	@Override
	public java.lang.String getTitle() {
		return (java.lang.String) getValue(4);
	}

	/**
	 * Setter for <code>MULTI_SCHEMA.T_BOOK.PUBLISHED_IN</code>. 
	 */
	@Override
	public void setPublishedIn(java.lang.Integer value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>MULTI_SCHEMA.T_BOOK.PUBLISHED_IN</code>. 
	 */
	@Override
	public java.lang.Integer getPublishedIn() {
		return (java.lang.Integer) getValue(5);
	}

	/**
	 * Setter for <code>MULTI_SCHEMA.T_BOOK.LANGUAGE_ID</code>. 
	 */
	@Override
	public void setLanguageId(java.lang.Integer value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>MULTI_SCHEMA.T_BOOK.LANGUAGE_ID</code>. 
	 */
	@Override
	public java.lang.Integer getLanguageId() {
		return (java.lang.Integer) getValue(6);
	}

	/**
	 * Setter for <code>MULTI_SCHEMA.T_BOOK.CONTENT_TEXT</code>. 
	 */
	@Override
	public void setContentText(java.lang.String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>MULTI_SCHEMA.T_BOOK.CONTENT_TEXT</code>. 
	 */
	@Override
	public java.lang.String getContentText() {
		return (java.lang.String) getValue(7);
	}

	/**
	 * Setter for <code>MULTI_SCHEMA.T_BOOK.CONTENT_PDF</code>. 
	 */
	@Override
	public void setContentPdf(byte[] value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>MULTI_SCHEMA.T_BOOK.CONTENT_PDF</code>. 
	 */
	@Override
	public byte[] getContentPdf() {
		return (byte[]) getValue(8);
	}

	// -------------------------------------------------------------------------
	// Record9 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row9<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, byte[]> fieldsRow() {
		return (org.jooq.Row9) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row9<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, byte[]> valuesRow() {
		return (org.jooq.Row9) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.test.jdbcoracle.generatedclasses.multi_schema.tables.TBook.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return org.jooq.test.jdbcoracle.generatedclasses.multi_schema.tables.TBook.AUTHOR_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field3() {
		return org.jooq.test.jdbcoracle.generatedclasses.multi_schema.tables.TBook.CO_AUTHOR_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field4() {
		return org.jooq.test.jdbcoracle.generatedclasses.multi_schema.tables.TBook.DETAILS_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return org.jooq.test.jdbcoracle.generatedclasses.multi_schema.tables.TBook.TITLE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field6() {
		return org.jooq.test.jdbcoracle.generatedclasses.multi_schema.tables.TBook.PUBLISHED_IN;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field7() {
		return org.jooq.test.jdbcoracle.generatedclasses.multi_schema.tables.TBook.LANGUAGE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field8() {
		return org.jooq.test.jdbcoracle.generatedclasses.multi_schema.tables.TBook.CONTENT_TEXT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<byte[]> field9() {
		return org.jooq.test.jdbcoracle.generatedclasses.multi_schema.tables.TBook.CONTENT_PDF;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value2() {
		return getAuthorId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value3() {
		return getCoAuthorId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value4() {
		return getDetailsId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value5() {
		return getTitle();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value6() {
		return getPublishedIn();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value7() {
		return getLanguageId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value8() {
		return getContentText();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public byte[] value9() {
		return getContentPdf();
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(org.jooq.test.jdbcoracle.generatedclasses.multi_schema.tables.interfaces.ITBook from) {
		setId(from.getId());
		setAuthorId(from.getAuthorId());
		setCoAuthorId(from.getCoAuthorId());
		setDetailsId(from.getDetailsId());
		setTitle(from.getTitle());
		setPublishedIn(from.getPublishedIn());
		setLanguageId(from.getLanguageId());
		setContentText(from.getContentText());
		setContentPdf(from.getContentPdf());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends org.jooq.test.jdbcoracle.generatedclasses.multi_schema.tables.interfaces.ITBook> E into(E into) {
		into.from(this);
		return into;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TBookRecord
	 */
	public TBookRecord() {
		super(org.jooq.test.jdbcoracle.generatedclasses.multi_schema.tables.TBook.T_BOOK);
	}
}