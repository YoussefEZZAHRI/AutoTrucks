package com.automotiva;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "com.automotiva" })
public class MaPieceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MaPieceApplication.class, args);
	}
	
//	@Bean
//	CommandLineRunner init(PieceRepository pieceRepository,
//			CategoriePiecesRepository categoryRepository) {
//		return (evt) -> Arrays.asList(
//				"jhoeller,dsyer,pwebb,ogierke,rwinch,mfisher,mpollack,jlong".split(","))
//				.forEach(
//						a -> {
//							Piece piece = pieceRepository.save(new Piece(a,
//									"password"));
//							pieceRepository.save(new Bookmark(account,
//									"http://bookmark.com/1/" + a, "A description"));
//							bookmarkRepository.save(new Bookmark(account,
//									"http://bookmark.com/2/" + a, "A description"));
//						});
//	}
}
