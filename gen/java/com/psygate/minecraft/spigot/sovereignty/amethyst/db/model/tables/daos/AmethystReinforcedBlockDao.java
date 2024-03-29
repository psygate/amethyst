/**
 * This class is generated by jOOQ
 */
package com.psygate.minecraft.spigot.sovereignty.amethyst.db.model.tables.daos;


import com.psygate.minecraft.spigot.sovereignty.amethyst.db.model.tables.AmethystReinforcedBlock;
import com.psygate.minecraft.spigot.sovereignty.amethyst.db.model.tables.records.AmethystReinforcedBlockRecord;

import java.util.List;
import java.util.UUID;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.Record4;
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
public class AmethystReinforcedBlockDao extends DAOImpl<AmethystReinforcedBlockRecord, com.psygate.minecraft.spigot.sovereignty.amethyst.db.model.tables.pojos.AmethystReinforcedBlock, Record4<Integer, Integer, Integer, UUID>> {

	/**
	 * Create a new AmethystReinforcedBlockDao without any configuration
	 */
	public AmethystReinforcedBlockDao() {
		super(AmethystReinforcedBlock.AMETHYST_REINFORCED_BLOCK, com.psygate.minecraft.spigot.sovereignty.amethyst.db.model.tables.pojos.AmethystReinforcedBlock.class);
	}

	/**
	 * Create a new AmethystReinforcedBlockDao with an attached configuration
	 */
	public AmethystReinforcedBlockDao(Configuration configuration) {
		super(AmethystReinforcedBlock.AMETHYST_REINFORCED_BLOCK, com.psygate.minecraft.spigot.sovereignty.amethyst.db.model.tables.pojos.AmethystReinforcedBlock.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected Record4<Integer, Integer, Integer, UUID> getId(com.psygate.minecraft.spigot.sovereignty.amethyst.db.model.tables.pojos.AmethystReinforcedBlock object) {
		return compositeKeyRecord(object.getX(), object.getY(), object.getZ(), object.getWorldUuid());
	}

	/**
	 * Fetch records that have <code>reinfid IN (values)</code>
	 */
	public List<com.psygate.minecraft.spigot.sovereignty.amethyst.db.model.tables.pojos.AmethystReinforcedBlock> fetchByReinfid(Long... values) {
		return fetch(AmethystReinforcedBlock.AMETHYST_REINFORCED_BLOCK.REINFID, values);
	}

	/**
	 * Fetch records that have <code>x IN (values)</code>
	 */
	public List<com.psygate.minecraft.spigot.sovereignty.amethyst.db.model.tables.pojos.AmethystReinforcedBlock> fetchByX(Integer... values) {
		return fetch(AmethystReinforcedBlock.AMETHYST_REINFORCED_BLOCK.X, values);
	}

	/**
	 * Fetch records that have <code>y IN (values)</code>
	 */
	public List<com.psygate.minecraft.spigot.sovereignty.amethyst.db.model.tables.pojos.AmethystReinforcedBlock> fetchByY(Integer... values) {
		return fetch(AmethystReinforcedBlock.AMETHYST_REINFORCED_BLOCK.Y, values);
	}

	/**
	 * Fetch records that have <code>z IN (values)</code>
	 */
	public List<com.psygate.minecraft.spigot.sovereignty.amethyst.db.model.tables.pojos.AmethystReinforcedBlock> fetchByZ(Integer... values) {
		return fetch(AmethystReinforcedBlock.AMETHYST_REINFORCED_BLOCK.Z, values);
	}

	/**
	 * Fetch records that have <code>world_uuid IN (values)</code>
	 */
	public List<com.psygate.minecraft.spigot.sovereignty.amethyst.db.model.tables.pojos.AmethystReinforcedBlock> fetchByWorldUuid(UUID... values) {
		return fetch(AmethystReinforcedBlock.AMETHYST_REINFORCED_BLOCK.WORLD_UUID, values);
	}
}
