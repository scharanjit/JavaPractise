package jsp;

public class theory {

}

/*
 
<select id="food" name="fooditems">
    <c:forEach items="${foods}" var="food">
        <option value="${food.key}">
            ${food.value}
        </option>
    <c:forEach>
</select>

 
 or
 
 <select id="food" name="fooditems">

<%
Map<String, String> foods = (Map<String, String>) request.getAttribute("foods");

for(Entry<String, String> food : foods.entrySet()) {
%>

    <option value="<%=food.getKey()%>">
        <%=food.getValue() %>
    </option>

<%
}
%>
 
 
 
 
 
 */

