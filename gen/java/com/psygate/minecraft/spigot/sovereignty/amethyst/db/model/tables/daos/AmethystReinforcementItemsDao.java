/**
 * This class is generated by jOOQ
 */
package com.psygate.minecraft.spigot.sovereignty.amethyst.db.model.tables.daos;


import com.psygate.minecraft.spigot.sovereignty.amethyst.db.model.tables.AmethystReinforcementItems;
import com.psygate.minecraft.spigot.sovereignty.amethyst.db.model.tables.records.AmethystReinforcementItemsRecord;

import java.util.List;

import javax.annotation.Generated;

import org.bukkit.Material;
import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


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
public class AmethystReinforcementItemsDao extends DAOImpl<AmethystReinforcementItemsRecord, com.psygate.minecraft.spigot.sovereignty.amethyst.db.model.tables.pojos.AmethystReinforcementItems, Long> {

	/**
	 * Create a new AmethystReinforcementItemsDao without any configuration
	 */
	public AmethystReinforcementItemsDao() {
		super(AmethystReinforcementItems.AMETHYST_REINFORCEMENT_ITEMS, com.psygate.minecraft.spigot.sovereignty.amethyst.db.model.tables.pojos.AmethystReinforcementItems.class);
	}

	/**
	 * Create a new AmethystReinforcementItemsDao with an attached configuration
	 */
	public AmethystReinforcementItemsDao(Configuration configuration) {
		super(AmethystReinforcementItems.AMETHYST_REINFORCEMENT_ITEMS, com.psygate.minecraft.spigot.sovereignty.amethyst.db.model.tables.pojos.AmethystReinforcementItems.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected Long getId(com.psygate.minecraft.spigot.sovereignty.amethyst.db.model.tables.pojos.AmethystReinforcementItems object) {
		return object.getReinfid();
	}

	/**
	 * Fetch records that have <code>reinfid IN (values)</code>
	 */
	public List<com.psygate.minecraft.spigot.sovereignty.amethyst.db.model.tables.pojos.AmethystReinforcementItems> fetchByReinfid(Long... values) {
		return fetch(AmethystReinforcementItems.AMETHYST_REINFORCEMENT_ITEMS.REINFID, values);
	}

	/**
	 * Fetch a unique record that has <code>reinfid = value</code>
	 */
	public com.psygate.minecraft.spigot.sovereignty.amethyst.db.model.tables.pojos.AmethystReinforcementItems fetchOneByReinfid(Long value) {
		return fetchOne(AmethystReinforcementItems.AMETHYST_REINFORCEMENT_ITEMS.REINFID, value);
	}

	/**
	 * Fetch records that have <code>material IN (values)</code>
	 */
	public List<com.psygate.minecraft.spigot.sovereignty.amethyst.db.model.tables.pojos.AmethystReinforcementItems> fetchByMaterial(Material... values) {
		return fetch(AmethystReinforcementItems.AMETHYST_REINFORCEMENT_ITEMS.MATERIAL, values);
	}

	/**
	 * Fetch records that have <code>amount IN (values)</code>
	 */
	public List<com.psygate.minecraft.spigot.sovereignty.amethyst.db.model.tables.pojos.AmethystReinforcementItems> fetchByAmount(Integer... values) {
		return fetch(AmethystReinforcementItems.AMETHYST_REINFORCEMENT_ITEMS.AMOUNT, values);
	}
}
