package file.upload;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

@WebServlet("/upload.do")
public class FileUpload extends HttpServlet {
	private static final long serialVersionUID = 2341123413L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String encoding = "utf-8";
		request.setCharacterEncoding(encoding);
		
				
		
		try {
			// File : 파일 또는 디렉토리(폴더)를 관리하는 class
			File currentDirPath = new File("C:\\Temp\\upload");
			
			// 세팅
			DiskFileItemFactory factory = new DiskFileItemFactory();
			factory.setRepository(currentDirPath); // 경로지정
			factory.setSizeThreshold(1024 * 1024); // 임시 파일의 크기를 바이트 단위로

			ServletFileUpload upload = new ServletFileUpload(factory);
			// 업로드 파일의 최대 크기 지정
			upload.setFileSizeMax(1024*1024*100); // 100메가 바이트 100MB
			// request를 분석해서 
			// 요청 파라메터들을 FileItem을 뽑고 그걸 List에서 담아서 돌려줌
			List<FileItem> items = upload.parseRequest(request);
			for (int i = 0; i < items.size(); i++) {
				
				FileItem fileItem = (FileItem) items.get(i);

				if (fileItem.isFormField()) {
					// 	getFieldName : 파라메터 키
					// getString : 파라메터 벨류
					System.out.println(fileItem.getFieldName() + "=" + fileItem.getString(encoding));
				} else {
					if (fileItem.getSize() > 0) {
						String fileName = fileItem.getName();
						File uploadFile = new File(currentDirPath + "\\" + fileName);
//						File uploadFile = new File(currentDirPath + File.separator + fileName);
//						File uploadFile = new File(currentDirPath + System.getProperty("file.separator") + fileName);
						fileItem.write(uploadFile);
						
					} // end if
				} // end if
			} // end for
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
