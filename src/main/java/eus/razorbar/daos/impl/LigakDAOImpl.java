package eus.razorbar.daos.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import eus.razorbar.beans.Liga;
import eus.razorbar.daos.LigakDAO;

@Repository
public class LigakDAOImpl implements LigakDAO {

	private final JdbcTemplate jdbcTemplate;

	public LigakDAOImpl() {
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setUrl("jdbc:mysql://localhost:3306/jeke_database");
		dataSource.setUsername("root");
		dataSource.setPassword("admin");
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public void createLiga(String izena) {

		String sql = "INSERT INTO ligak VALUES (?, ?)";
		this.jdbcTemplate.update(sql, 2, izena);
	}

	@Override
	public List<Liga> getAllLeagues() {

		String sql = "SELECT izena FROM ligak";

		List<String> ligenIzenak = this.jdbcTemplate.queryForList(sql, String.class);

		List<Liga> ligakList = new ArrayList<>();
		for (String izena : ligenIzenak) {
			Liga liga = new Liga();
			liga.setIzena(izena);
			ligakList.add(liga);
		}

		return ligakList;
	}

	public static void main(String[] args) {
		LigakDAO dao = new LigakDAOImpl();
//		dao.createLiga("LehenengoMaila");
		getLigak(dao);

	}

	private static void getLigak(LigakDAO dao) {
		List<Liga> ligak = dao.getAllLeagues();

		if (ligak.isEmpty()) {
			System.out.println("Ez dago ligarik");
			return;
		}

		for (Liga liga : ligak) {
			System.out.println("Liga: " + liga.getIzena());
		}
	}

}
