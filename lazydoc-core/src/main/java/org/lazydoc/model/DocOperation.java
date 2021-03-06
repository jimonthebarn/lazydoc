package org.lazydoc.model;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class DocOperation implements Comparable<DocOperation> {
	private Integer order = 0;
	private String fileName;
	private String path = "";
	private String pathDescription = "";
	private String httpMethod = "";
	private String responseStatus = "";
	private String nickname = "";
	private DocOperationResponse operationResponse = new DocOperationResponse();
	private String shortDescription = "";
	private String description = "";
	private String notes = "";
	private String errorResponse = "";
	private String level = "plattform";
	private String staticRequestSample = "";
	private List<DocParameter> parameters = new ArrayList<DocParameter>();
	private String role;
	private List<DocExternalDocumentation> externalDocumentations = new ArrayList<>();
	private Set<DocError> errorList = new TreeSet<>();
	private boolean deprecated;

	public Integer getOrder() {
		return order;
	}

	public void setOrder(Integer order) {
		this.order = order;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getPathDescription() {
		return pathDescription;
	}

	public void setPathDescription(String pathDescription) {
		this.pathDescription = pathDescription;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getHttpMethod() {
		return httpMethod;
	}

	public void setHttpMethod(String httpMethod) {
		this.httpMethod = httpMethod;
	}

	public String getResponseStatus() {
		return responseStatus;
	}

	public void setResponseStatus(String responseStatus) {
		this.responseStatus = responseStatus;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public DocOperationResponse getOperationResponse() {
		return operationResponse;
	}

	public void setOperationResponse(DocOperationResponse operationResponse) {
		this.operationResponse = operationResponse;
	}

	public String getShortDescription() {
		if (StringUtils.isBlank(shortDescription)) {
			return description;
		}
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getErrorResponse() {
		return errorResponse;
	}

	public void setErrorResponse(String errorResponse) {
		this.errorResponse = errorResponse;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public List<DocParameter> getParameters() {
		return parameters;
	}

	public void setParameters(List<DocParameter> parameters) {
		this.parameters = parameters;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getStaticRequestSample() {
		return staticRequestSample;
	}

	public void setStaticRequestSample(String staticRequestSample) {
		this.staticRequestSample = staticRequestSample;
	}

	@Override
	public int compareTo(DocOperation o) {
		int compareResult = this.order.compareTo(o.order);
		if (compareResult == 0) {
			return this.nickname.compareTo(o.nickname);
		}
		return compareResult;
	}

	public List<DocExternalDocumentation> getExternalDocumentations() {
		return externalDocumentations;
	}

	public void setExternalDocumentations(List<DocExternalDocumentation> externalDocumentations) {
		this.externalDocumentations = externalDocumentations;
	}

	public boolean hasExternalDocumentation() {
		return !externalDocumentations.isEmpty();
	}

	public boolean isDeprecated() {
		return deprecated;
	}

	public void setDeprecated(boolean deprecated) {
		this.deprecated = deprecated;
	}

	public Set<DocError> getErrorList() {
		return errorList;
	}

	public void setErrorList(Set<DocError> errorList) {
		this.errorList = errorList;
	}
}