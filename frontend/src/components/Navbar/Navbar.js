import "./Navbar.css";
import { FaBell, FaMoon, FaUserCircle } from "react-icons/fa";

function Navbar() {
  return (
    <nav className="navbar">
      <div className="logo">
        🏦 FinCore Nexus
      </div>

      <div className="nav-right">
        <FaBell className="nav-icon" />
        <FaMoon className="nav-icon" />
        <FaUserCircle className="profile-icon" />
        <span>Admin</span>
      </div>
    </nav>
  );
}

export default Navbar;