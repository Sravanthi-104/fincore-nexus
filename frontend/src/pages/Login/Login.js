import "./Login.css";
import { FaUser, FaLock } from "react-icons/fa";

function Login() {
  return (
    <div className="login-container">

      <div className="login-card">

        <h1>🏦 FinCore Nexus</h1>
        <p>Banking Management System</p>

        <div className="input-box">
          <FaUser />
          <input
            type="text"
            placeholder="Username"
          />
        </div>

        <div className="input-box">
          <FaLock />
          <input
            type="password"
            placeholder="Password"
          />
        </div>

        <button className="login-btn">
          Login
        </button>

      </div>

    </div>
  );
}

export default Login;