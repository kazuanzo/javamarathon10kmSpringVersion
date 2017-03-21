package marathon10km.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import marathon10km.domain.Hotel;
import marathon10km.repository.HotelRepository;

@Service
public class HotelService {
	@Autowired
	private HotelRepository repository;

	// 金額以下のホテル一覧を取得するメソッド
	@Transactional//トランザクション処理
	public List<Hotel> SerchHotel(Integer price) {
		//repositoryを利用してホテルリストを取得
		List<Hotel> hotels=repository.findByNamedQuery(price);
		return hotels;
	}
}