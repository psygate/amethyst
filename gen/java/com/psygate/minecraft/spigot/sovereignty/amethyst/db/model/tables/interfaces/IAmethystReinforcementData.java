/**
 * This class is generated by jOOQ
 */
package com.psygate.minecraft.spigot.sovereignty.amethyst.db.model.tables.interfaces;


import java.io.Serializable;
import java.sql.Timestamp;
import java.util.UUID;

import javax.annotation.Generated;


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
public interface IAmethystReinforcementData extends Serializable {

	/**
	 * Getter for <code>nucleus.amethyst_reinforcement_data.reinfid</code>.
	 */
	public Long getReinfid();

	/**
	 * Getter for <code>nucleus.amethyst_reinforcement_data.creation_time</code>.
	 */
	public Timestamp getCreationTime();

	/**
	 * Getter for <code>nucleus.amethyst_reinforcement_data.creator</code>.
	 */
	public UUID getCreator();

	/**
	 * Getter for <code>nucleus.amethyst_reinforcement_data.group_id</code>.
	 */
	public Long getGroupId();

	/**
	 * Getter for <code>nucleus.amethyst_reinforcement_data.hardening_time</code>.
	 */
	public Timestamp getHardeningTime();

	/**
	 * Getter for <code>nucleus.amethyst_reinforcement_data.strength</code>.
	 */
	public Integer getStrength();

	/**
	 * Getter for <code>nucleus.amethyst_reinforcement_data.max_strength</code>.
	 */
	public Integer getMaxStrength();

	/**
	 * Getter for <code>nucleus.amethyst_reinforcement_data.is_public</code>.
	 */
	public Boolean getIsPublic();

	/**
	 * Getter for <code>nucleus.amethyst_reinforcement_data.unbreakable</code>.
	 */
	public Boolean getUnbreakable();
}
