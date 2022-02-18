package com.kata.gbsuftblai

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import com.kata.gbsuftblai.services.GbsuFtbLaiService
import org.springframework.beans.factory.annotation.Autowired
import org.junit.jupiter.api.Assertions.assertEquals

@SpringBootTest
class GbsuFtbLaiApplicationTests {

	
	val gbsuFtbLaiService = GbsuFtbLaiService();
	

	@Test
	fun testGbsuFtbLaiShouldReturn1() {
		assertEquals("1",gbsuFtbLaiService.convertNumber("1"))
	}
	
	@Test
	fun testGbsuFtbLaiShouldReturn3() {
		assertEquals("GbsuGbsu",gbsuFtbLaiService.convertNumber("3"))
	}
	
	@Test
	fun testGbsuFtbLaiShouldReturn5() {
		assertEquals("FtbFtb",gbsuFtbLaiService.convertNumber("5"))
	}
	
	@Test
	fun testGbsuFtbLaiShouldReturn7() {
		assertEquals("Lai",gbsuFtbLaiService.convertNumber("7"))
	}
	
	
	@Test
	fun testGbsuFtbLaiShouldReturn9() {
		assertEquals("Gbsu",gbsuFtbLaiService.convertNumber("9"))
	}
	
	
	@Test
	fun testGbsuFtbLaiShouldReturn51() {
		assertEquals("GbsuFtb",gbsuFtbLaiService.convertNumber("51"))
	}
	
	@Test
	fun testGbsuFtbLaiShouldReturn53() {
		assertEquals("FtbGbsu",gbsuFtbLaiService.convertNumber("53"))
	}
	
	@Test
	fun testGbsuFtbLaiShouldReturn33() {
		assertEquals("GbsuGbsuGbsu",gbsuFtbLaiService.convertNumber("33"))
	}
	
	@Test
	fun testGbsuFtbLaiShouldReturn27() {
		assertEquals("GbsuLai",gbsuFtbLaiService.convertNumber("27"))
	}
	
	@Test
	fun testGbsuFtbLaiShouldReturn15() {
		assertEquals("GbsuFtbFtb",gbsuFtbLaiService.convertNumber("15"))
	}

}
