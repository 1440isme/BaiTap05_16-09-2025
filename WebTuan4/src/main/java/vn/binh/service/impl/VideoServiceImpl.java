package vn.binh.service.impl;

import java.util.List;

import vn.binh.dao.VideoDAO;
import vn.binh.dao.impl.VideoDAOImpl;
import vn.binh.entity.Video;
import vn.binh.service.VideoService;

public class VideoServiceImpl implements VideoService {

	VideoDAO videoDAO = new VideoDAOImpl();

	@Override
	public void insert(Video video) {
		videoDAO.create(video);

	}

	@Override
	public void edit(Video video) {
		videoDAO.update(video);

	}

	@Override
	public void delete(int id) {
		videoDAO.remove(id);

	}

	@Override
	public Video getIdVideo(int id) {
		return videoDAO.findById(id);
	}

	@Override
	public Video getTitleVideo(String title) {
		return videoDAO.findByTitle(title);
	}

	@Override
	public List<Video> getAll() {
		return videoDAO.findAll();
	}

	@Override
	public List<Video> search(String keyword) {
		return videoDAO.search(keyword);
	}

}
