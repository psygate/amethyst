/**
 * This class is generated by jOOQ
 */
package com.psygate.minecraft.spigot.sovereignty.amethyst.db.model;


import com.psygate.minecraft.spigot.sovereignty.amethyst.db.model.tables.AmethystDefaultGroup;
import com.psygate.minecraft.spigot.sovereignty.amethyst.db.model.tables.AmethystReinforcedBlock;
import com.psygate.minecraft.spigot.sovereignty.amethyst.db.model.tables.AmethystReinforcementData;
import com.psygate.minecraft.spigot.sovereignty.amethyst.db.model.tables.AmethystReinforcementItems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


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
public class Nucleus extends SchemaImpl {

	private static final long serialVersionUID = -199331890;

	/**
	 * The reference instance of <code>nucleus</code>
	 */
	public static final Nucleus NUCLEUS = new Nucleus();

	/**
	 * No further instances allowed
	 */
	private Nucleus() {
		super("nucleus");
	}

	@Override
	public final List<Table<?>> getTables() {
		List result = new ArrayList();
		result.addAll(getTables0());
		return result;
	}

	private final List<Table<?>> getTables0() {
		return Arrays.<Table<?>>asList(
			AmethystDefaultGroup.AMETHYST_DEFAULT_GROUP,
			AmethystReinforcedBlock.AMETHYST_REINFORCED_BLOCK,
			AmethystReinforcementData.AMETHYST_REINFORCEMENT_DATA,
			AmethystReinforcementItems.AMETHYST_REINFORCEMENT_ITEMS);
	}
}
