<table><tr><td> <em>Assignment: </em> IT114 Chatroom Milestone3</td></tr>
<tr><td> <em>Student: </em> Muhannad Darwish (mmd23)</td></tr>
<tr><td> <em>Generated: </em> 5/5/2023 1:01:58 AM</td></tr>
<tr><td> <em>Grading Link: </em> <a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-006-S23/it114-chatroom-milestone3/grade/mmd23" target="_blank">Grading</a></td></tr></table>
<table><tr><td> <em>Instructions: </em> <p>Implement the features from Milestone3 from the proposal document:&nbsp;&nbsp;<a href="https://docs.google.com/document/d/1ONmvEvel97GTFPGfVwwQC96xSsobbSbk56145XizQG4/view">https://docs.google.com/document/d/1ONmvEvel97GTFPGfVwwQC96xSsobbSbk56145XizQG4/view</a></p>
</td></tr></table>
<table><tr><td> <em>Deliverable 1: </em> Connection Screens </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add screenshots showing the screens with the following data</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/98350970/236349263-4f35c59f-8ec9-4488-bc82-6ced49dad916.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>the screen shot shows it asking for the port and the host <br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/98350970/236350008-e50413ea-36a3-4ac3-bd6b-fe9e611028a6.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>this shows the user name that you enter before connecting to the chat<br><br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Briefly explain the code for each step of the process</td></tr>
<tr><td> <em>Response:</em> <p>the clientUI does these things:<div><br></div><div><div><ul><li>It extends the JFrame class and implements the IClientEvents<br>interface.</li><li>It defines a Hashtable object to store user IDs and names.</li><li>It defines a<br>constructor that initializes the user interface with the appropriate screens and components.</li><li>It creates<br>a method to add a menu to the user interface.</li><li>It creates a method<br>to create the initial connection screen, which prompts the user to enter the<br>host and port information.</li><li>It creates a method to create the user input screen,<br>which prompts the user to enter their username.</li><li>It creates a method to create<br>the chat screen, which displays the chat history and allows the user to<br>send messages.</li><li>It creates a method to create the rooms screen, which allows the<br>user to search for and join chat rooms.</li><li>It creates methods to handle navigation<br>between the different screens.</li><li>It creates methods to handle sending and receiving messages, updating<br>the user list, and handling other events related to the chat functionality.</li><li>It creates<br>methods to handle resizing and moving the window.</li><li>It creates a main method to<br>launch the application.</li></ul></div></div><br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 2: </em> Chatroom view </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add screenshots showing the related UI</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/98350970/236353540-1b635fd7-7255-40a0-89dc-b5fb2812e14b.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>this screeshot contains a converstion between me and &quot;bob&quot; the chat saving the<br>conversation, showing the history, and the message area and the send button<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/98350970/236355963-93db9126-f65c-4ed1-b549-939f6eaede99.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>so in this screenshot the code that lets the enter key send a<br>message is located in the createChatScreen() method.  Specifically, it&#39;s in the JTextArea&#39;s<br>addKeyListener() method. The addKeyListener() method adds a KeyListener to the JTextArea so that<br>when the user presses the Enter key, it sends the message to the<br>server.<br></p>
</td></tr>
</table></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 3: </em> Chat Activities </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707834-bf5a5b13-ec36-4597-9741-aa830c195be2.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Show screenshots of the result of the following commands</td></tr>
<tr><td><table><tr><td>Missing Image</td></tr>
<tr><td> <em>Caption:</em> (missing)</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Show the code snippets for each command</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/98350970/236379812-5b0ad94e-0353-4957-8609-99f4be1037bc.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>the commands <br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/98350970/236379977-a17a6040-08a2-4f57-9720-2ef332925ead.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>the logic of the commands<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 3: </em> Briefly explain the code flow of each command</td></tr>
<tr><td> <em>Response:</em> <div>If command is equal to ROLL, the code generates a random integer between<br>0 and 100 using Math.random() method and then converts the integer to a<br>string using Integer.toString() method. The resulting string is used to create a message<br>that says that the user "rolled" a particular number, and this message is<br>sent to the client using the sendMessage() method..If command is equal to FLIP,<br>the code generates a random integer between 1 and 2 using Math.random() method.<br>If the resulting integer is 1, the bot "flips heads" and creates a<br>message with a green color. If the integer is 2, the bot "flips<br>tails" and creates a message with a red color. The resulting message is<br>sent to the client using the sendMessage() method.</div><div><br></div><div><br></div><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 4: </em> Custom Text </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707795-a9c94a71-7871-4572-bfae-ad636f8f8474.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Screenshots of examples</td></tr>
<tr><td><table><tr><td>Missing Image</td></tr>
<tr><td> <em>Caption:</em> (missing)</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Briefly explain how you got the UI side to render the text accordingly</td></tr>
<tr><td> <em>Response:</em> <p>(missing)</p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 5: </em> Whisper </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707795-a9c94a71-7871-4572-bfae-ad636f8f8474.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add screenshots showing a demo of whisper commands</td></tr>
<tr><td><table><tr><td>Missing Image</td></tr>
<tr><td> <em>Caption:</em> (missing)</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Show the server-side code snippets of how this feature works</td></tr>
<tr><td><table><tr><td>Missing Image</td></tr>
<tr><td> <em>Caption:</em> (missing)</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 3: </em> Briefly explain the code logic of how this was achieved</td></tr>
<tr><td> <em>Response:</em> <p>(missing)</p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 6: </em> Mute/Unmute </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707834-bf5a5b13-ec36-4597-9741-aa830c195be2.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add screenshots demoing this feature</td></tr>
<tr><td><table><tr><td>Missing Image</td></tr>
<tr><td> <em>Caption:</em> (missing)</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Add screenshots of the code snippets that achieve this feature</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/98350970/236380502-0ac935e2-140c-40fb-b3be-31f4e0ca4f2e.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>shows the mute and unmute command<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 3: </em> Briefly explain the code logic of how this was achieved</td></tr>
<tr><td> <em>Response:</em> <div>In the case of the MUTE command, a loop is then initiated to<br>iterate through all the ServerThread objects (i.e. clients) in the clients list. For<br>each client, if their name matches either the name of the muted client<br>or the name of the client that initiated the MUTE command, a message<br>is sent to them indicating that the specified client has been muted. This<br>is achieved using the send() method of the ServerThread class. In the case<br>of the UNMUTE command, it&nbsp; is extracted as the name of the client<br>to be unmuted. The loop then iterates through the mutedList of the client<br>object and if the specified name is found, it is removed from the<br>list. Another loop is then initiated to iterate through all the ServerThread objects<br>in the clients list. For each client, if their name matches either the<br>name of the unmuted client or the name of the client that initiated<br>the UNMUTE command, a message is sent to them indicating that the specified<br>client has been unmuted.</div><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 7: </em> Misc </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Pull request from milestone3 to main</td></tr>
<tr><td> <a rel="noreferrer noopener" target="_blank" href="https://github.com/modar23/IT114-006/pull/6">https://github.com/modar23/IT114-006/pull/6</a> </td></tr>
</table></td></tr>
<table><tr><td><em>Grading Link: </em><a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-006-S23/it114-chatroom-milestone3/grade/mmd23" target="_blank">Grading</a></td></tr></table>