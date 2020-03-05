package marek.poznan.spring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "clubs")
public class Clubs {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "name")
	private String name;

	@Column(name = "best_player")
	private String bestPlayer;

	@Column(name = "value")
	private int value;

	public Clubs() {

	}

	public Clubs(int id, String name, String bestPlayer, int value) {
		this.id = id;
		this.name = name;
		this.bestPlayer = bestPlayer;
		this.value = value;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBestPlayer() {
		return bestPlayer;
	}

	public void setBestPlayer(String bestPlayer) {
		this.bestPlayer = bestPlayer;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Clubs [id=" + id + ", name=" + name + ", bestPlayer=" + bestPlayer + ", value=" + value + "]";
	}

}
