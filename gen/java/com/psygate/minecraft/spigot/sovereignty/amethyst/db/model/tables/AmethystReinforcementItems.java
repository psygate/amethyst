/**
 * This class is generated by jOOQ
 */
package com.psygate.minecraft.spigot.sovereignty.amethyst.db.model.tables;


import com.psygate.minecraft.spigot.sovereignty.amethyst.db.model.Keys;
import com.psygate.minecraft.spigot.sovereignty.amethyst.db.model.Nucleus;
import com.psygate.minecraft.spigot.sovereignty.amethyst.db.model.tables.records.AmethystReinforcementItemsRecord;
import com.psygate.minecraft.spigot.sovereignty.nucleus.sql.util.MaterialConverter;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.bukkit.Material;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


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
public class AmethystReinforcementItems extends TableImpl<AmethystReinforcementItemsRecord> {

	private static final long serialVersionUID = -1040143792;

	/**
	 * The reference instance of <code>nucleus.amethyst_reinforcement_items</code>
	 */
	public static final AmethystReinforcementItems AMETHYST_REINFORCEMENT_ITEMS = new AmethystReinforcementItems();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<AmethystReinforcementItemsRecord> getRecordType() {
		return AmethystReinforcementItemsRecord.class;
	}

	/**
	 * The column <code>nucleus.amethyst_reinforcement_items.reinfid</code>.
	 */
	public final TableField<AmethystReinforcementItemsRecord, Long> REINFID = createField("reinfid", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>nucleus.amethyst_reinforcement_items.material</code>.
	 */
	public final TableField<AmethystReinforcementItemsRecord, Material> MATERIAL = createField("material", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "", new MaterialConverter());

	/**
	 * The column <code>nucleus.amethyst_reinforcement_items.amount</code>.
	 */
	public final TableField<AmethystReinforcementItemsRecord, Integer> AMOUNT = createField("amount", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * Create a <code>nucleus.amethyst_reinforcement_items</code> table reference
	 */
	public AmethystReinforcementItems() {
		this("amethyst_reinforcement_items", null);
	}

	/**
	 * Create an aliased <code>nucleus.amethyst_reinforcement_items</code> table reference
	 */
	public AmethystReinforcementItems(String alias) {
		this(alias, AMETHYST_REINFORCEMENT_ITEMS);
	}

	private AmethystReinforcementItems(String alias, Table<AmethystReinforcementItemsRecord> aliased) {
		this(alias, aliased, null);
	}

	private AmethystReinforcementItems(String alias, Table<AmethystReinforcementItemsRecord> aliased, Field<?>[] parameters) {
		super(alias, Nucleus.NUCLEUS, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<AmethystReinforcementItemsRecord> getPrimaryKey() {
		return Keys.KEY_AMETHYST_REINFORCEMENT_ITEMS_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<AmethystReinforcementItemsRecord>> getKeys() {
		return Arrays.<UniqueKey<AmethystReinforcementItemsRecord>>asList(Keys.KEY_AMETHYST_REINFORCEMENT_ITEMS_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<AmethystReinforcementItemsRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<AmethystReinforcementItemsRecord, ?>>asList(Keys.AMETHYST_REINFORCEMENT_ITEMS_IBFK_1);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AmethystReinforcementItems as(String alias) {
		return new AmethystReinforcementItems(alias, this);
	}

	/**
	 * Rename this table
	 */
	public AmethystReinforcementItems rename(String name) {
		return new AmethystReinforcementItems(name, null);
	}
}
