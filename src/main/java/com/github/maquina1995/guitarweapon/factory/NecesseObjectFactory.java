package com.github.maquina1995.guitarweapon.factory;

import java.util.Map;

import necesse.inventory.recipe.Ingredient;

public class NecesseObjectFactory {

	public Ingredient[] buildItemIngredients(Map<String, Integer> nameAmount) {

		return (Ingredient[]) nameAmount.entrySet()
				.stream()
				.map(pair -> this.buildIngredient(pair.getKey(), pair.getValue()))
				.toArray();
	}

	public Ingredient[] buildItemIngredient(String name, int amount) {

		return new Ingredient[] { this.buildIngredient(name, amount) };
	}

	private Ingredient buildIngredient(String name, int amount) {

		return new Ingredient(name, amount);
	}
}
