<%-- DO NOT MODIFY THIS FILE, IT IS AUTOMATICALLY GENERATED. INSTEAD MODIFY list.haml --%>
<html>
  <head>
    <title>Simple GSP page</title>
    <meta content='main' name='layout' />
  </head>
  <body>
    <g:if test='${flash.message}'>
      <div class='message' id='message'>
        ${flash.message}
      </div>
    </g:if>
    <table>
      <thead>
        <tr>
          <th>ID</th>
          <th>Login</th>
          <th>Password</th>
        </tr>
      </thead>
      <tbody>
        <g:each in='${userInstanceList}' status='i' var='user'>
          <tr class="${(i%2) == 0 ? 'odd' : 'even'}">
            <td>
              <g:link action='show' id='${user.id}'>${user.id}</g:link>
            </td>
            <td>
              ${user.login}
            </td>
            <td>
              ${user.password}
            </td>
            <td>
              ${user.role}
            </td>
          </tr>
        </g:each>
      </tbody>
      <div class='paginateButtons' id='pagination'>
        <g:paginate total='${userInstanceTotal}'></g:paginate>
      </div>
    </table>
  </body>
</html>