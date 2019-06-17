/**
 * This class is generated by jOOQ
 */
package com.psygate.minecraft.spigot.sovereignty.amethyst.db.model.tables.records;


import com.psygate.minecraft.spigot.sovereignty.amethyst.db.model.tables.AmethystDefaultGroup;
import com.psygate.minecraft.spigot.sovereignty.amethyst.db.model.tables.interfaces.IAmethystDefaultGroup;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AmethystDefaultGroupRecord extends UpdatableRecordImpl<AmethystDefaultGroupRecord> implements Record2<byte[], Long>, IAmethystDefaultGroup {

	private static final long serialVersionUID = 1276986230;

	/**
	 * Setter for <code>nucleus.amethyst_default_group.player</code>.
	 */
	public void setPlayer(byte[] value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>nucleus.amethyst_default_group.player</code>.
	 */
	@Override
	public byte[] getPlayer() {
		return (byte[]) getValue(0);
	}

	/**
	 * Setter for <code>nucleus.amethyst_default_group.group_id</code>.
	 */
	public void setGroupId(Long value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>nucleus.amethyst_default_group.group_id</code>.
	 */
	@Override
	public Long getGroupId() {
		return (Long) getValue(1);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record1<byte[]> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row2<byte[], Long> fieldsRow() {
		return (Row2) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row2<byte[], Long> valuesRow() {
		return (Row2) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<byte[]> field1() {
		return AmethystDefaultGroup.AMETHYST_DEFAULT_GROUP.PLAYER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field2() {
		return AmethystDefaultGroup.AMETHYST_DEFAULT_GROUP.GROUP_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public byte[] value1() {
		return getPlayer();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value2() {
		return getGroupId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AmethystDefaultGroupRecord value1(byte[] value) {
		setPlayer(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AmethystDefaultGroupRecord value2(Long value) {
		setGroupId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AmethystDefaultGroupRecord values(byte[] value1, Long value2) {
		value1(value1);
		value2(value2);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached AmethystDefaultGroupRecord
	 */
	public AmethystDefaultGroupRecord() {
		super(AmethystDefaultGroup.AMETHYST_DEFAULT_GROUP);
	}

	/**
	 * Create a detached, initialised AmethystDefaultGroupRecord
	 */
	public AmethystDefaultGroupRecord(byte[] player, Long groupId) {
		super(AmethystDefaultGroup.AMETHYST_DEFAULT_GROUP);

		setValue(0, player);
		setValue(1, groupId);
	}
}
