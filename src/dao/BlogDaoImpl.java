package dao;

import java.io.Reader;
import java.io.StringReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import model.Blog;
import utility.ConnectionManager;

public class BlogDaoImpl implements BlogDaoInterface{
	final String INSERT_BLOG_SQL ="INSERT INTO BLOG(blogId, blogTitle, blogdescription, postedOn) VALUES(?,?,?,?)";
	//private final String INSERT_BLOG_SQL ="INSERT INTO testing(blogId) VALUES(seq_blog.nextval)";
	//private static final String SELECT_ALL_BLOGS = "SELECT * FROM BLOG";
	@Override
	public void insertBlog(Blog blog) throws SQLException {
		// TODO Auto-generated method stub
		System.out.println(INSERT_BLOG_SQL);
		try {
			Connection con = ConnectionManager.getConnection();
			PreparedStatement ps = con.prepareStatement (INSERT_BLOG_SQL);
			ps.setInt(1, blog.getBlogId());
			ps.setString(2, blog.getBlogTitle());
//			ps.setString(3, blog.getBlogDescription());
			System.out.println(blog.getBlogId()+" " + blog.getBlogTitle()+" "+blog.getBlogDescription()+" "+blog.getPostedOn());
			Reader reader = new StringReader(blog.getBlogDescription());
			ps.setCharacterStream(3, reader, blog.getBlogDescription().length());
			
//			ps.setClob(3,blog.getBlogDescription());
			ps.setDate(4, java.sql.Date.valueOf(blog.getPostedOn()));
//			System.out.println(ps);
			ps.execute();
		}
		catch(SQLException e ){
			System.out.println(e);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
//	public void insertBlog(Blog blog) throws SQLException {
//		// TODO Auto-generated method stub
////		System.out.println(INSERT_BLOG_SQL);
//		try {
//			Connection con = ConnectionManager.getConnection();
//			PreparedStatement ps = con.prepareStatement (INSERT_BLOG_SQL);
//			ps.setInt(1, blog.getBlogId());
//			ps.execute();
//		}
//		catch(SQLException e ){
//			System.out.println(e);
//			System.out.println("Failed");
//			
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
	@Override
	public Blog selectBlog(int blogId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Blog> selectAllBlogs() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteBlog(int id) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateBlog(Blog blog) throws SQLException, Exception {
		// TODO Auto-generated method stub
		return false;
	}

}
