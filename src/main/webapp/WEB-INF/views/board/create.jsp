<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<div class="container-xxl flex-grow-1 container-p-y">
              
              <h4 class="fw-bold py-3 mb-4">
              <span class="text-muted fw-light">
              </span>고민을 작성해 주세요</h4>

          
              <div class="row">                
                <div class="col-xxl">
                  <div class="card mb-4">
                    <div class="card-header d-flex align-items-center justify-content-between">
                      <h5 class="mb-0">나의 고민 추가</h5>
                      <small class="text-muted float-end"></small>
                    </div>
                    <div class="card-body">
                      
                      
                      <form:form action="/board/create" modelAttribute="boardVO" method="post" enctype="multipart/form-data">
                        
                        <div class="row mb-3">
                          <label class="col-sm-2 col-form-label" for="basic-default-name">나의 고민 제목</label>
                          <div class="col-sm-10">
                            <form:input type="text" class="form-control" path="board_head" id="basic-default-name" placeholder="제목을 입력하세요" />
                            <form:errors path="board_head"></form:errors>
                          </div>
                        </div>
                      
 						
 						
                          
                          <div class="row mb-3">
                          <label class="col-sm-2 col-form-label" for="basic-default-name">고민 내용</label>
                          <div class="col-sm-10">
                        	<form:errors path="board_contents"></form:errors>
                            <form:textarea type="text" class="form-control" path="board_contents" id="summernote" placeholder="상세 설명을 입력하세요" />         	
                          </div>        
                       	 </div>
                      
                      </form:form>
                    </div>
                  </div>
                </div>
              </div>
            </div>
            <script>
      $('#summernote').summernote({
        placeholder: 'Hello stand alone ui',
        tabsize: 2,
        height: 120,
        toolbar: [
          ['style', ['style']],
          ['font', ['bold', 'underline', 'clear']],
          ['color', ['color']],
          ['para', ['ul', 'ol', 'paragraph']],
          ['table', ['table']],
          ['insert', ['link', 'picture', 'video']],
          ['view', ['fullscreen', 'codeview', 'help']]
        ]
      });
    </script>