<table><tr><td> <em>Assignment: </em> IT114 Chatroom Milestone 2</td></tr>
<tr><td> <em>Student: </em> Muhannad Darwish (mmd23)</td></tr>
<tr><td> <em>Generated: </em> 4/6/2023 11:47:11 PM</td></tr>
<tr><td> <em>Grading Link: </em> <a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-006-S23/it114-chatroom-milestone-2/grade/mmd23" target="_blank">Grading</a></td></tr></table>
<table><tr><td> <em>Instructions: </em> <p>Implement the features from Milestone2 from the proposal document:&nbsp; <a href="https://docs.google.com/document/d/1ONmvEvel97GTFPGfVwwQC96xSsobbSbk56145XizQG4/view">https://docs.google.com/document/d/1ONmvEvel97GTFPGfVwwQC96xSsobbSbk56145XizQG4/view</a></p>
</td></tr></table>
<table><tr><td> <em>Deliverable 1: </em> Payload </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Payload Screenshots</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/98350970/230532500-250536d9-6679-408c-9cf8-6f7c8ff1ecdf.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>the screenshot is showing payload code w explanation<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/98350970/230532730-6e718d59-f3c9-47bc-ae5a-934cafb3cde7.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>the second part<br></p>
</td></tr>
</table></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 2: </em> Server-side commands </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Show the code for the mentioned commands</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/98350970/230535279-74ca11a6-bdc9-41f1-b438-d4919875f6cf.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>the commands <br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/98350970/230535404-e96c8ef0-8d66-4bd4-939e-61fc58311a76.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>code for /flip<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Explain the logic/implementation of each commands</td></tr>
<tr><td> <em>Response:</em> <div>/roll and /flip commands roll a number between 0 and 6 and flip<br>heads or tails, respectively. The results of each are broadcasted by the server<br>to the entire room. (Functions implemented in Room.Java)</div><div><br></div><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 3: </em> Text Display </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707834-bf5a5b13-ec36-4597-9741-aa830c195be2.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Show the code for the various style handling via markdown or special characters</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/98350970/230536386-114dd0bb-2cd4-4e6f-8b09-6ab0b69bb440.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>how bold is processed<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/98350970/230536504-36a9fa4a-5cd2-48da-af89-4ed60fb92cc5.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>how italics is proccessed <br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/98350970/230536594-20895a22-d341-4a23-82c1-9c9e846cb3e2.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>how underline is processed<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/98350970/230536668-686f6382-6bba-49b9-bc51-4860ed72b75e.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>how color is processed <br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Show source message and the result output in the terminal (note, you won't actually see the styles until Milestone3)</td></tr>
<tr><td><table><tr><td>Missing Image</td></tr>
<tr><td> <em>Caption:</em> (missing)</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 3: </em> Explain how you got each style applied</td></tr>
<tr><td> <em>Response:</em> <div>Client has the ability to select the type of font for his message<br>through use of commands. Wrap texts between "" (e.x. " text *") for<br>bold, " _ text _" for italics, and "~ text ~" for underline.</div><div><br></div><div>Change<br>text color by declaring a color between two pound signs (e.x "#red# this<br>text would be red"). To change back to black/default color type '##'.</div><div><br></div><div>Different functionalities<br>can be implemented on one line (e.x. a single word can be both<br>bold and italicized).</div><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 4: </em> Misc </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707795-a9c94a71-7871-4572-bfae-ad636f8f8474.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Include the pull request for Milestone2 to main</td></tr>
<tr><td>Not provided</td></tr>
</table></td></tr>
<table><tr><td><em>Grading Link: </em><a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-006-S23/it114-chatroom-milestone-2/grade/mmd23" target="_blank">Grading</a></td></tr></table>
