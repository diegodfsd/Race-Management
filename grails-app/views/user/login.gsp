<%-- DO NOT MODIFY THIS FILE, IT IS AUTOMATICALLY GENERATED. INSTEAD MODIFY login.haml --%>
<html>
  <head>
    <meta charset='UTF-8' content='text/html' http-equiv='Content-Type' />
    <title>Simple GSP page</title>
    <meta content='main' name='layout' />
  </head>
  <body>
    <div class='body' id='body'>
      <h1>
        Login
      </h1>
      <g:if test='${flash.message}'>
        <div class='message' id='message'>
          ${flash.message}
        </div>
      </g:if>
      <g:form action='authenticate' method='post'>
        <div class='dialog' id='dialog'>
          <table>
            <tbody>
              <tr class='prop'>
                <td class='name' valign='top'>
                  <label for='login'>Login:</label>
                </td>
                <td valign='top'>
                  <input id='login' name='login' type='text' />
                </td>
              </tr>
              <tr class='prop'>
                <td class='name' valign='top'>
                  <label for='password'>Password:</label>
                </td>
                <td valign='top'>
                  <input id='password' name='password' type='password' />
                </td>
              </tr>
            </tbody>
          </table>
        </div>
        <div class='buttons' id='buttons'>
          <span class='button'>
            <input type='submit' value='Login' />
          </span>
        </div>
      </g:form>
    </div>
  </body>
</html>