

<h1>Fund Transfer System with Design Patterns</h1>

<div class="section">
    <h2>Badges</h2>
    <span class="badge">Java</span>
    <span class="badge">Design Patterns</span>
    <span class="badge">Security</span>
</div>

<div class="section">
    <h2>Project Structure</h2>
    <ul>
        <li><strong>Simple Solution:</strong> Basic implementation with fundamental classes for accounts, transactions, and users.</li>
        <li><strong>Refined Solution:</strong> Contains Factory Method, Singleton, and Decorator design patterns.</li>
    </ul>
</div>

<div class="section">
    <h2>Design Patterns</h2>
    <p>
        The project demonstrates three design patterns:
    </p>
    <ul>
        <li><strong>Factory Method:</strong> Reduces coupling and improves flexibility.</li>
        <li><strong>Singleton:</strong> Ensures a single instance, providing controlled access.</li>
        <li><strong>Decorator:</strong> Adds functionality dynamically, reducing tight coupling.</li>
    </ul>
</div>

<div class="section">
    <h2>Security Improvements</h2>
    <p>
        This project uses MOOD and QMOOD metrics to analyze security quality attributes. Here's a summary of the results:
    </p>
    <div class="highlight">
        <h3>MOOD Metrics (Coupling Factor)</h3>
        <ul>
            <li>Simple Solution: 60.0000%</li>
            <li>Refined Solution (Factory Method): 36.1111%</li>
            <li>Refined Solution (Singleton): 52.3810%</li>
            <li>Refined Solution (Decorator): 22.2222%</li>
        </ul>
        <h3>QMOOD Metrics (Effectiveness & Flexibility)</h3>
        <ul>
            <li>Simple Solution: Effectiveness 0.453, Flexibility 0.8825</li>
            <li>Refined Solution (Factory Method): Effectiveness 0.5087, Flexibility 1.0217</li>
            <li>Refined Solution (Singleton): Effectiveness 0.4646, Flexibility 0.9114</li>
            <li>Refined Solution (Decorator): Effectiveness 1.1021, Flexibility 2.5053</li>
        </ul>
    </div>
</div>

<div class="section">
    <h2>Getting Started</h2>
    <p>
        To run the project, you'll need a Java development environment like IntelliJ IDEA or Eclipse. Follow these steps to get started:
    </p>
    <ol>
        <li><strong>Compile the Code:</strong> Open the project in your IDE and compile the code.</li>
        <li><strong>Run the Main Class:</strong> For the simple solution, run <code>FundTransferSystem</code>. For refined solutions, run the respective main class in each design pattern folder.</li>
        <li><strong>Analyze the Results:</strong> Observe the output to understand how design patterns influence the overall behavior and security.</li>
    </ol>
</div>

<div class="section">
    <h2>Conclusion</h2>
    <p>
        The refined solutions demonstrate significant improvements in reducing coupling and enhancing flexibility and effectiveness. This suggests that incorporating design patterns such as Factory Method, Singleton, and Decorator can contribute to improved security quality attributes in software systems.
    </p>
</div>

</body>
</html>
