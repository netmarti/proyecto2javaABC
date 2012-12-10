package com.mkyong.core;

/**
 * Spring bean
 * 
 */
public class User {
	private String name;
	private int cell;

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param cell
	 *            the cell to set
	 */
	public void setCell(int cell) {
		this.cell = cell;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the cell
	 */
	public int getCell() {
		return cell;
	}

	public String toString() {
		return new StringBuilder().append("Name: " + name)
				.append("Cell: " + cell).toString();
	}

	public void printUser() {
		System.out.println("User: " + name + "\nCell: " + cell);
	}
}