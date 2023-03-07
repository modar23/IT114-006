<table><tr><td> <em>Assignment: </em> It114 Milestone1</td></tr>
<tr><td> <em>Student: </em> Muhannad Darwish (mmd23)</td></tr>
<tr><td> <em>Generated: </em> 3/6/2023 11:25:26 PM</td></tr>
<tr><td> <em>Grading Link: </em> <a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-006-S23/it114-milestone1/grade/mmd23" target="_blank">Grading</a></td></tr></table>
<table><tr><td> <em>Instructions: </em> <ol><li>Create a new branch called Milestone1</li><li>At the root of your repository create a folder called Project</li><ol><li>You will be updating this folder with new code as you do milestones</li><li>You won't be creating separate folders for milestones; milestones are just branches</li></ol><li>Create a milestone1.md file inside the Project folder</li><li>Git add/commit/push it to Github</li><li>Create a pull request from Milestone1 to main (don't complete/merge it yet)</li><li>Copy in the latest Socket sample code from the most recent Socket Part example of the lessons</li><ol><li>Recommended Part 5 (clients should be having names at this point and not ids)</li><li><a href="https://github.com/MattToegel/IT114/tree/Module5/Module5">https://github.com/MattToegel/IT114/tree/Module5/Module5</a>&nbsp;<br></li></ol><li>Git add/commit the baseline</li><li>Ensure the sample is working and fill in the below deliverables</li><li>Get the markdown content or the file and paste it into the milestone1.md file or replace the file with the downloaded version</li><li>Git add/commit/push all changes</li><li>Complete the pull request merge from step 5</li><li>Locally checkout main</li><li>git pull origin main</li></ol></td></tr></table>
<table><tr><td> <em>Deliverable 1: </em> Startup </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add screenshot showing your server being started and running</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/98350970/223305586-e851e9b7-4fe2-4a39-a870-8534f97a0e4f.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>This screenshot shows the server connecting to port 3001, then the program showing<br>the server is listening <br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/98350970/223306422-25c582cd-1f7b-4267-8e77-8cd4fb8fb375.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>relevant code server.java<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/98350970/223306953-b064afe6-8e40-4877-92be-8509b7b9401a.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>relevant code pt2 server.java<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/98350970/223307123-68c3a9e6-7c1e-4e92-8876-dd2b0740c475.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>code pt3 server.java<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/98350970/223307265-a67bd603-2b1b-4bdd-9a9b-a46884d1d756.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>code pt4, the last part is in the first screenshot <br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Add screenshot showing your client being started and running</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/98350970/223308336-05d2b91c-8099-4a1a-819f-0a617404701e.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>this screenshot shows the client connecting to port 3001, also a assigned name,<br>it is currently waiting for input, server shows connection as well on the<br>right <br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/98350970/223308899-920f3034-f571-43ad-bf0f-8aef5831fa19.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>client code pt1 <br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/98350970/223309116-4e3b8505-33e5-4f2b-a950-75feac113776.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>code pt2 <br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/98350970/223309656-86d6a7f2-d9d3-4fb4-8a25-943924166779.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>pt3<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/98350970/223309902-fee6be28-1aab-4db4-b4bb-4819b28dca50.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>pt4<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/98350970/223310052-ac56a9b3-3247-4910-bdf7-3ecd97052c2d.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>pt5<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/98350970/223310261-bb67b595-63fe-4963-a74a-95acad7d3faf.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>pt6 <br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 3: </em> Briefly explain the connection process</td></tr>
<tr><td> <em>Response:</em> <p>the server side immediately starts listening to port 3001 and&nbsp; start accepting incoming<br>connections on that port.<div>It too will use PrintWriter and BufferedReader for simple String<br>sending and receiving Listen to port.</div><div><div>The connect command will take the ip-address:port value(3001)<br>to connect to a target server</div><div>After the connection is established and if a<br>command wasn’t processed the helper class PrintWriter will be used to send data<br>over the socket to the server</div><div><div>The socket() API creates an endpoint for communications<br>and returns a socket descriptor that represents the endpoint.</div></div></div><div><br></div><div><br></div><div><br><div><br></div><div><br></div><div><br></div></div><br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 2: </em> Sending/Receiving </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add screenshot(s) showing evidence related to the checklist</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/98350970/223313012-579096a4-08f7-4d3c-97de-cb445be0a96a.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>this shows that 2 clients are connected to the server <br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/98350970/223316432-51043166-f2d0-42ea-9ddc-e95e42711a06.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>created new room called klk <br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/98350970/223315822-80a137f4-88b4-4dc1-84b7-496823dfae8a.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>client identifier <br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/98350970/223316718-4dfeebb8-9e92-4074-8730-a6e9426c076a.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>shows that bob can only send messages to the same room(KLK) and mo<br>cant read it <br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/98350970/223317555-26786d81-e694-4cf4-a819-e4c861a1e0fe.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>clearly show the message being broadcasted in all clients in the same room<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Briefly explain how the messages are sent, broadcasted, and received</td></tr>
<tr><td> <em>Response:</em> <div>(client)messages are sent after the connection is established and if a command wasn’t<br>processed the helper class PrintWriter will be used to send data over the<br>socket to the server.</div><div>(client recieving) a simple readLine() method that wait until data<br>is received While the client is running it’ll keep waiting for new messages</div><div>If<br>the message isn’t a command and the socket connection is determined to be<br>open/connected it’ll attempt to write the message to the server (specifically the ServerThread)</div><div><br></div><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 3: </em> Disconnecting / Terminating </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add screenshot(s) showing evidence related to the checklist</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/98350970/223318995-87b9771e-258d-4ce4-baf8-9f6a1ccdd8ef.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>only 1 client disconnected and the server is still running and the other<br>client is still online <br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/98350970/223319196-37aeeed1-8997-48cc-ae9c-76295a257e8f.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>server disconnected(right side)but the clients are still running<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Briefly explain how the various disconnects/terminations are handled</td></tr>
<tr><td> <em>Response:</em> <div><span style="white-space: pre-wrap;">when a client becomes disconnected from a socket's point of view,<br>this indicates that the socket has been closed. This can take place for<br>a variety of reasons, but the fact that the server has detached itself<br>or shut down is by far the most typical explanation. The fact that<br>the socket is still active prevents the client software from crashing when anything<br>like this occurs. Because of this, the client is able to maintain their<br>communication with the server. The fact that the socket is still active prevents<br>the server from crashing when a client or clients lose connection. This enables<br>the server to keep communicating with the client throughout the process.</span></div><div><span style="white-space: pre-wrap;">The<br>server will call the client’s disconnect() as sort of a confirmation (design decision)</span></div><div><span<br>style="white-space: pre-wrap;">The server will broadcast to all other clients that this client disconnected</span></div><div><br></div><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 4: </em> Misc </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add the pull request for this branch</td></tr>
<tr><td> <a rel="noreferrer noopener" target="_blank" href="https://github.com/modar23/IT114-006/pull/4">https://github.com/modar23/IT114-006/pull/4</a> </td></tr>
<tr><td> <em>Sub-Task 2: </em> Talk about any issues or learnings during this assignment</td></tr>
<tr><td> <em>Response:</em> <p>this project was extremely difficult , due to the high learning curve i<br>had to do. but what i did learn was that Sockets are a<br>realtime bidirectional communication channel over TCP. so in java we have the Socket<br>class representing the client and the ServerSocket class representing the server. The Socket<br>then connects to an ip address and a port. after that the ServerSocket<br>just listens to a port for incoming connections since it’s already running on<br>the server it doesn’t need to know it’s own ip address<div><br></div><br></p><br></td></tr>
</table></td></tr>
<table><tr><td><em>Grading Link: </em><a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-006-S23/it114-milestone1/grade/mmd23" target="_blank">Grading</a></td></tr></table>