package lineProject;

import java.awt.geom.Point2D;

public class Line {

	private static final double TOLERANCE = 1E-14;

	private Point2D.Double p1, p2;

	/**
	 * Constructs a line with the specified point and slope.
	 * Precondition: line is not vertical
	 * @param p a point on the line
	 * @param m the slope of the line
	 */
	public Line(Point2D.Double p, double m) {
		this.p1 = p;
		this.p2 = new Point2D.Double(p.x + 1, m * (p.x + 1) + (p1.y - m * p1.x));
		//		this.p2.x = p.x + 1;
		//		this.p2.y = m * p2.x + (p1.y - m * p1.x);
	}

	/**
	 * Constructs a line with the specified 2 points.
	 * @param p1 a point on the line
	 * @param p2 a point on the line such that ! p1.equals(p2)
	 * @throws IllegalArgumentException if p1.equals(p2)
	 */
	public Line(Point2D.Double p1, Point2D.Double p2) {
		if(p1.equals(p2)) throw new IllegalArgumentException("cannot get line for two equal points");
		this.p1 = p1;
		this.p2 = p2;
	}

	/**
	 * Constructs a line with the specified equation.
	 * Precondition: equation is of the form y = mx + b or x = a
	 * @param equation an equation of the form y = mx + b or x = a representing the line
	 */
	public Line(String equation) {
		if(equation.charAt(0) == 'y') {	// y = 10x + 10
			double slope = Integer.parseInt(equation.substring(4, equation.indexOf('x')));
			double yInt = Integer.parseInt(equation.substring(equation.indexOf('x') + 4));

			p1 = new Point2D.Double(0, yInt);
			p2 = new Point2D.Double(1, slope + yInt);
		}
		else {
			p1 = new Point2D.Double(Integer.parseInt(equation.substring(4)), 0);
			p2 = new Point2D.Double(Integer.parseInt(equation.substring(4)), 1);
		}
	}

	private static boolean closeEnough(double one, double two) {
		return Math.abs(one - two) < TOLERANCE;
	}

	/**
	 * Returns true if this line is vertical, false otherwise.
	 * @return true if this line is vertical, false otherwise
	 */
	public boolean isVertical() {
		return p1.x == p2.x;
	}

	/**
	 * Returns the slope of this line.
	 * Precondition: ! isVertical()
	 * @return the slope of this line
	 * @throws IllegalStateException if isVertical()
	 */
	public double getSlope() {
		if(isVertical()) throw new IllegalStateException("cannot get slope of vertical line");
		return (p1.y - p2.y) / (p1.x - p2.x);
	}

	/**
	 * Returns the x intercept of this line.
	 * Precondition: isVertical()
	 * @return the x intercept of this line
	 * @throws IllegalStateException if ! isVertical()
	 */
	public double getXIntercept() {
		if(!isVertical()) throw new IllegalStateException("cannot get x intercept of non-vertical line");
		return p1.x;
	}

	/**
	 * Returns the y intercept of this line.
	 * Precondition: ! isVertical()
	 * @return the y intercept of this line
	 * @throws IllegalStateException if isVertical()
	 */
	public double getYIntercept() {
		if(isVertical()) throw new IllegalStateException("cannot get y intercept of vertical line");
		return p1.y - getSlope() * p1.x;
	}

	public boolean equals(Object other) {
		return this.toString().equals(other.toString());
	}

	public String toString() {
		if (isVertical()) return "x = " + p1.x;
		return "y = " + getSlope() + "x + " + getYIntercept();
	}
}
