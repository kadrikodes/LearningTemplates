<!DOCTYPE html>
<html>
<head>
    <title>Task Assignment Notification</title>
    <style>
        body {
            font-family: 'Arial', sans-serif;
            background-color: #f4f4f4;
            color: #333;
            line-height: 1.6;
        }
        .container {
            max-width: 600px;
            margin: 30px auto;
            padding: 20px;
            background-color: #fff;
            border: 1px solid #ddd;
            border-radius: 5px;
            box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
        }
        h1 {
            color: #0056b3;
            text-align: center;
        }
        p {
            font-size: 1em;
            margin-bottom: 10px;
        }
        .task-detail {
            background-color: #e9e9e9;
            padding: 10px;
            border-left: 3px solid #0056b3;
            margin-bottom: 10px;
        }
        .task-detail strong {
            color: #333;
        }
        .footer {
            text-align: center;
            margin-top: 20px;
            font-size: 0.8em;
            color: #666;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Task Assignment</h1>
        <div class="task-detail">
            <p><strong>Task:</strong> ${taskName}</p>
            <p><strong>Description:</strong> ${taskDescription}</p>
            <p><strong>Due Date:</strong> ${dueDate?string("MM/dd/yyyy")}</p>
            <p><strong>Priority:</strong> ${priority}</p>
            <p><strong>Assigned To:</strong> ${assignedTo}</p>
            <p><strong>Created By:</strong> ${createdBy}</p>
            <p><strong>Status:</strong> ${status}</p>
            <p><strong>Department:</strong> ${department}</p>
        </div>
        <p>Please ensure that you review the task details and acknowledge receipt.</p>
        <p>Thank you,</p>
        <p><strong>[Your Company's Name]</strong></p>
        <div class="footer">
            This is an automated message. Please do not reply directly to this email.
        </div>
    </div>
</body>
</html>
