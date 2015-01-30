<%@page import="com.liferay.portal.kernel.servlet.SessionMessages"%>
<%@ include file="/html/membership/init.jsp"%>

<portlet:actionURL var="saveMemberships" name="saveMembership">
</portlet:actionURL>
<portlet:resourceURL var="deleteMemberships" id="deleteMembership"/>
<portlet:renderURL var="listview">
	<portlet:param name="mvcPath" value="/html/membership/add.jsp" />
</portlet:renderURL>
<aui:script>

AUI().use(
  'aui-node',
  function(A) {
    var node = A.one('#membershipdelete');
    node.on(
      'click',
      function() {
     var idArray = [];
     A.all('input[name=<portlet:namespace/>rowIds]:checked').each(function(object) {
      idArray.push(object.get("value"));
       });
       if(idArray==""){
			  alert("Please select records!");
		  }else{
			  var d = confirm("Are you sure you want to delete the selected membership ?");
		  if(d){
		   var url = '<%=deleteMemberships%>';
          A.io.request(url,
         {
          data: {  
                <portlet:namespace />membershipIds: idArray,  
                 },
          on: {
               success: function() { 
                   alert('deleted successfully');
                   window.location='<%=listview%>';
              },
               failure: function() {
                  
                 }
                }
                 }
                );
		  																		
		  console.log(idArray);
	  
      return true;
  }
  else
    return false;
}             
      }
    );
  }
);

AUI().ready('event', 'node','transition',function(A){
  A.one('#addMembershipForm').hide();
  setTimeout(function(){
    A.one('#addMembershipMessage').transition('fadeOut');
},1000)
 });


</aui:script>
<aui:script>
AUI().use(
  'aui-node',
  function(A) {
    var node = A.one('#membershipadd');
    node.on(
      'click',
      function() {
         A.one('#membershipAddDelete').hide();
         A.one('#addMembershipForm').show();
                     
      }
    );
  }
);


 
AUI().use(
  'aui-node',
  function(A) {
    var node = A.one('#membershipcancel');
    node.on(
      'click',
      function() {
         A.one('#membershipAddDelete').show();
         A.one('#addMembershipForm').hide();
                     
      }
    );
  }
);

</aui:script>
</head>

<body>
<% if(SessionMessages.contains(renderRequest.getPortletSession(),"membershipName-empty-error")){%>
<p id="addMembershipMessage" class="alert error-alert"><liferay-ui:message key="Please Enter MembershipName"/></p>
<%} 
 if(SessionMessages.contains(renderRequest.getPortletSession(),"membershipName-duplicate-error")){
%>
<p id="addMembershipMessage"  class="alert error-alert"><liferay-ui:message key="MembershipName already Exits"/></p>
<%} 
%>
		<div id="membershipAddDelete" class="control-group text-right">
			<a href="#" class="btn btn-primary" id="membershipadd"><i class="icon-plus"></i> Add</a>
			<a href="#" class="btn btn-danger" id="membershipdelete"><i class="icon-trash"></i> Delete</a>
		</div>
		<div  id="addMembershipForm" class="panel">
			<div class="panel-heading">
				<h4>Add</h4>
			</div>
			<div class="panel-body">
				<aui:form name="myForm" action="<%=saveMemberships.toString()%>" >
					<aui:input name="membershipId" type="hidden" id="membershipId" />
					<div class="form-inline">
						<label>Membership Name: </label>
						<input name="<portlet:namespace/>membership_name" type="text">
						<button type="submit" class="btn btn-primary"><i class="icon-ok"></i> Submit</button>
						<button  type="reset" id ="membershipcancel" class="btn btn-danger"><i class="icon-remove"></i> Cancel</button>
					</div>
				</aui:form>
			</div>
		</div>
 		
 
	
</body>

<%

PortletURL iteratorURL = renderResponse.createRenderURL();
iteratorURL.setParameter("mvcPath", "/html/membership/add.jsp");
RowChecker rowChecker = new RowChecker(renderResponse);

PortalPreferences portalPrefs = PortletPreferencesFactoryUtil.getPortalPreferences(request); 
String sortByCol = ParamUtil.getString(request, "orderByCol"); 
String sortByType = ParamUtil.getString(request, "orderByType"); 

if (Validator.isNotNull(sortByCol ) && Validator.isNotNull(sortByType )) { 
	
 
portalPrefs.setValue("NAME_SPACE", "sort-by-col", sortByCol); 
portalPrefs.setValue("NAME_SPACE", "sort-by-type", sortByCol); 
 
} else { 
 
	
	sortByType = portalPrefs.getValue("NAME_SPACE", "sort-by-type ", "asc");   
}

%>
<%!
  com.liferay.portal.kernel.dao.search.SearchContainer<Membership> searchContainer;
%>
<div>
<liferay-ui:search-container orderByCol="<%=sortByCol %>"
	orderByType="<%=sortByType %>"
	rowChecker="<%= new RowChecker(renderResponse) %>" delta="5"
	emptyResultsMessage="No records are available for Memberships"
	deltaConfigurable="true" iteratorURL="<%=iteratorURL%>">
	<liferay-ui:search-container-results>

		<%
            List<Membership> membershipList = MembershipLocalServiceUtil.getMemberships(searchContainer.getStart(), searchContainer.getEnd());
		OrderByComparator orderByComparator =  CustomComparatorUtil.getMembershipOrderByComparator(sortByCol, sortByType);
   
               Collections.sort(membershipList,orderByComparator);
  
               results = membershipList;
               total = MembershipLocalServiceUtil.getMembershipsCount();
               pageContext.setAttribute("results", results);
               pageContext.setAttribute("total", total);

 %>

	</liferay-ui:search-container-results>
	<liferay-ui:search-container-row className="Membership"
		keyProperty="membershipId" modelVar="membershipId" rowVar="curRow"
		escapedModel="<%= true %>">
		<liferay-ui:search-container-column-text orderable="<%=true %>"
			name="name" property="membershipName"
			orderableProperty="membershipName" />
	
		<liferay-ui:search-container-column-jsp name="Edit"
			path="/html/membership/editClick.jsp" />

	</liferay-ui:search-container-row>
	<liferay-ui:search-iterator />

</liferay-ui:search-container>
</div>

