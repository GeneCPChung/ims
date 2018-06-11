package io.github.JDSalisbury.ims;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ImsApp {

	public static void main(String[] args) {
		SpringApplication.run(ImsApp.class, args);

		// LocalDate date = LocalDate.of(2018, 6, 12);
		// InventoryItem underTest = new InventoryItem("1234E", 5, date, "Apple",
		// "EACH", "Aisle 10", .59, "Granny Smith");
		// System.out.println(underTest.getExpirationDate());
		// System.out.println(LocalDate.now());
		// System.out.println(underTest.getExpireDateFromToday());
		// System.out.println(underTest.isSoonToExpire());
		// System.out.println(underTest.isExpiringTomorrow());
		// System.out.println(underTest.isExpired());
		// System.out.println(underTest.isOnWarningList());

	}

}
